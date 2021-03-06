package com.project.kcookserver.store;

import com.project.kcookserver.account.entity.Account;
import com.project.kcookserver.configure.response.exception.CustomException;
import com.project.kcookserver.configure.response.exception.CustomExceptionStatus;
import com.project.kcookserver.configure.security.authentication.CustomUserDetails;
import com.project.kcookserver.store.dto.CreateStoreReq;
import com.project.kcookserver.store.dto.StoreDetailRes;
import com.project.kcookserver.util.location.NaverGeocode;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import static com.project.kcookserver.configure.entity.Status.*;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class StoreService {
    private final StoreRepository storeRepository;
    private final NaverGeocode naverGeocode;

    public StoreDetailRes getStoreInfo(CustomUserDetails customUserDetails) {
        StoreDetailRes storeDetailRes = storeRepository.getStoreByAccountAndStatus(customUserDetails.getAccount(), VALID)
                .orElseThrow(() -> new CustomException(CustomExceptionStatus.STORE_NOT_FOUND));
        return storeDetailRes;
    }

    @Transactional
    public Long createStoreByAccount(CustomUserDetails customUserDetails, CreateStoreReq dto) {
        Account account = customUserDetails.getAccount();
        Optional<StoreDetailRes> optional = storeRepository.getStoreByAccountAndStatus(account, VALID);
        if (optional.isPresent()) throw new CustomException(CustomExceptionStatus.ALREADY_CREATED_STORE);
        naverGeocode.getCoordinate(dto.getAddress());
        Store store = new Store(dto, account);
        Store save = storeRepository.save(store);
        return save.getStoreId();
    }

    @Transactional
    public void updateStoreByAccount(CustomUserDetails customUserDetails, CreateStoreReq dto) {
        Account account = customUserDetails.getAccount();
        Store store = storeRepository.findByAccountAndStatus(account, VALID)
                .orElseThrow(() -> new CustomException(CustomExceptionStatus.STORE_NOT_FOUND));
        naverGeocode.getCoordinate(dto.getAddress());
        store.updateStore(dto);
    }
}
