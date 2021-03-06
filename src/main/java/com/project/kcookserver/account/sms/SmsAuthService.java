package com.project.kcookserver.account.sms;

import com.project.kcookserver.account.AccountRepository;
import com.project.kcookserver.account.entity.Account;
import com.project.kcookserver.configure.response.exception.CustomException;
import com.project.kcookserver.configure.response.exception.CustomExceptionStatus;
import com.project.kcookserver.configure.security.authentication.CustomUserDetails;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Random;

@Transactional
@RequiredArgsConstructor
@Slf4j
@Service
public class SmsAuthService {

    private final AccountRepository accountRepository;

    @Value("${coolsms.apikey}")
    private String apiKey;

    @Value("${coolsms.apiSecret}")
    private String apiSecret;

    @Value("${coolsms.fromNumber}")
    private String fromNumber;

    @PostConstruct
    public void init() {
        this.fromNumber = fromNumber.replaceAll("-", "");
    }

    private Integer createRandNum() {
        Random rand = new Random();
        String str = "";
        for (int i = 0; i < 4; i++) {
            String ran = Integer.toString(rand.nextInt(10));
            str += ran;
        }
        return Integer.parseInt(str);
    }


    public Integer updateAccountSmsToken(CustomUserDetails customUserDetails, String phoneNumber) {
        Account account = accountRepository.findById(customUserDetails.getAccount().getAccountId())
                .orElseThrow(()-> new CustomException(CustomExceptionStatus.ACCOUNT_NOT_VALID));

        if (account.isSmsCertified()) throw new CustomException(CustomExceptionStatus.ALREADY_CERTIFICATION_ACCOUNT);

        Integer randNum = createRandNum();

        Message coolsms = new Message(apiKey, apiSecret);

        HashMap<String, String> params = new HashMap<String, String>();
        params.put("to", phoneNumber);
        params.put("from", fromNumber);
        params.put("type", "SMS");
        params.put("text", "[K.Cook] ???????????? " + randNum.toString() + " ??? ???????????????.");
        params.put("app_version", "1.0");


        try {
            JSONObject send = coolsms.send(params);
            if(Integer.parseInt(send.get("error_count").toString()) > 0) throw new CustomException(CustomExceptionStatus.FAILED_TO_RECEPTION);
            log.info(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"))+" : send SMS Authentication Token to "+phoneNumber);
        } catch (CoolsmsException e) {
            log.warn(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"))+" : "+e.getMessage());
            throw new CustomException(CustomExceptionStatus.FAILED_TO_RECEPTION);
        }

        account.createTokenToPhoneNumber(randNum, phoneNumber);

        return randNum;
    }

    public void updateAccountSmsCertification(CustomUserDetails customUserDetails, Integer smsToken) {
        Account account = accountRepository.findById(customUserDetails.getAccount().getAccountId())
                .orElseThrow(()-> new CustomException(CustomExceptionStatus.ACCOUNT_NOT_VALID));
        if (account.getSmsAuthToken().equals(smsToken)) account.certifySmsAuth();
        else throw new CustomException(CustomExceptionStatus.FAILED_TO_CERTIFICATION);
    }
}
