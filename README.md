<h1 align="center">Welcome to K.Cook-Server ๐</h1>
<p>
  <img alt="Version" src="https://img.shields.io/badge/version-1.0.0-blue.svg?cacheSeconds=2592000" />
  <a href="https://github.com/kefranabg/readme-md-generator/graphs/commit-activity" target="_blank">
    <img alt="Maintenance" src="https://img.shields.io/badge/Maintained%3F-yes-green.svg" />
  </a>
  <a href="https://github.com/vividswan/K.Cook-Server/blob/main/LICENSE" target="_blank">
    <img alt="License: MIT" src="https://img.shields.io/github/license/vividswan/K.Cook-Server" />
  </a>
</p>

> K.Cook Back-End Server Project

<div align=center>
  <img width="249" alt="แแฆแแตแแฎแจแแกแแณ" src="https://user-images.githubusercontent.com/54254402/133126938-f76c8dfb-255e-4daf-afef-499736d987f6.png">
</div>
<h2 align=center>์ผ์ด์ฟก์ ์ปค์คํ์ผ์ดํฌ ์ฃผ๋ฌธ ํ๋ซํผ์ ๊ฐ๋ฐํ๊ณ  ์๋ ์ด๊ธฐ์คํํธ์์๋๋ค.</h2>

![์น 1920 โ ์ผ์ดํฌ](https://user-images.githubusercontent.com/54254402/133126499-abab1a68-12dd-429c-b204-5be48b3b11a4.png)


## API Docs

### โจ [K.Cook Server Swagger](https://prod.kcook-cake.com/swagger-ui/index.html)

## ๊ธฐ์ ์คํ

<p>
  <img src="https://img.shields.io/badge/-SpringBoot-blue"/>&nbsp
  <img src="https://img.shields.io/badge/-JPA-red"/>&nbsp
  <img src="https://img.shields.io/badge/-MySQL-yellow"/>&nbsp
  <img src="https://img.shields.io/badge/-JWT-blue"/>&nbsp
  <img src="https://img.shields.io/badge/-AWS-orange"/>&nbsp
  <img src="https://img.shields.io/badge/-Nginx-red"/>&nbsp
  <img src="https://img.shields.io/badge/-Swagger-black"/>&nbsp
  <img src="https://img.shields.io/badge/-SpringSecurity-green"/>&nbsp
  <img src="https://img.shields.io/badge/-Querydsl-violet"/>&nbsp
</p>

## ๊ฐ๋ฐํ๊ฒฝ


- backend
  - java11
  - gradle
  - spring-boot 2.5.3

## ์์คํ ๊ตฌ์ฑ๋

![drawio](https://user-images.githubusercontent.com/54254402/136225436-8693e719-f8cc-4670-bbbd-33e6e68096cc.png)


## Usage

```sh
$ ./gradlew clean build
```

## ERD

<img width="759" alt="แแณแแณแแตแซแแฃแบ 2021-10-06 แแฉแแฎ 11 36 17" src="https://user-images.githubusercontent.com/54254402/136225484-8fc163fa-2129-4975-b813-f2c25af7a854.png">


### Access server side using following URL

```
https://prod.kcook-cake.com/app
```

## ๊ฐ๋ฐ์ผ์ง

- ํ์ ๊ฐ์ API ์์ฑ (21/08/17) - `commit` : [e963d38](https://github.com/vividswan/K.Cook-Server/commit/e963d38c186761ecd3af5c638924f9fd42cbf64b)
- ๋ก๊ทธ์ธ API ์์ฑ (21/08/18) - `commit` : [3b4891c](https://github.com/vividswan/K.Cook-Server/commit/3b4891c36db93b0a990759bfb405111ed56b117c)
- ๋ก๊ทธ์ธํ ํ์ ์ ๋ณด ์กฐํ API ์์ฑ (21/08/18) - `commit` : [04f78b9](https://github.com/vividswan/K.Cook-Server/commit/04f78b97d081e634cf1a9d764e64e0c5315186ff)
- ์ฌ์ฉ์ SMS ํ ํฐ ์์ฑ ๋ฐ ์ธ์ฆ API ์์ฑ (21/08/19) - `commit` : [ffaf516](https://github.com/vividswan/K.Cook-Server/commit/ffaf51668b2c33c4b0ca7154194dcc40c130cd30)
- ์ผ์ดํฌ ์ํ ๋ชฉ๋ก ์กฐํ API, ์ถ๊ฐ ์ํ ๋ชฉ๋ก ์กฐํ API ์์ฑ (21/08/24) - `commit` : [9510921](https://github.com/vividswan/K.Cook-Server/commit/9510921e1ff3b74dc7eb16cc305ccf2bbc133f43)
- ์ํ ๋ํ์ผ ์กฐํ API ์์ฑ (21/08/28) - `commit` : [2b4197a](https://github.com/vividswan/K.Cook-Server/commit/2b4197a744b76a5658d6349dcd089360d88ba12f)
- ์์ผ์ธ ํ์ ์กฐํ ํ ์ฟ ํฐ ์ฆ์  ๊ธฐ๋ฅ ์์ฑ `[Scheduler ์ฌ์ฉ]` (21/08/28) - `commit` : [0b4ea9c](https://github.com/vividswan/K.Cook-Server/commit/0b4ea9ccc9461caf728878212483aa2226d8d087)
- ์ผ์ดํฌ, ์ถ๊ฐ ์ํ ๊ฒ์ ์กฐ๊ฑด ๊ณ ๋ํ [`Querydsl`์ ํ์ฉํ ์ ๋ ฌ๊ณผ ์ฌ๋ฌ ์ธ์๋ค์ ๋์  ์ฟผ๋ฆฌ ์์ฑ] (21/08/30) - `commit` : [dc3cf97](https://github.com/vividswan/K.Cook-Server/commit/dc3cf9736c4dd99759562ea4c6aba59efada77b1), [556bd7a](https://github.com/vividswan/K.Cook-Server/commit/556bd7ac289b97a897fd93b9929cfbf07bcaa60a)
- ์ฃผ๋ฌธ ์์ฑ API ์์ฑ (21/08/31) - `commit` : [1ef32a8](https://github.com/vividswan/K.Cook-Server/commit/1ef32a839021935b83e87d7d62132c6b78355402)
- ๊ณ ๊ฐ ์ฃผ๋ฌธ ์กฐํ API ์์ฑ (21/09/01) - `commit` : [ff91b18](https://github.com/vividswan/K.Cook-Server/commit/ff91b1891dcadb84616f31711deb83668f6e0614)
- ํ์๊ฐ์, ๋ก๊ทธ์ธ ํตํฉ ํ์คํธ ์ฝ๋ (21/09/07) - `commit` : [b9a0815](https://github.com/vividswan/K.Cook-Server/commit/b9a0815d17ad3133c8387d669c2dc70dc3ea5314), [6279b75](https://github.com/vividswan/K.Cook-Server/commit/6279b75740b2b60629f2e290fdaaef62b68b04c9), `์์  commit` : [7c4bf18](https://github.com/vividswan/K.Cook-Server/commit/7c4bf1873b1e7ac6d40bc62a8bb43db269f74a1f)
- ์ธ์ฆ ๋ ๊ณ์ ์ ์คํ ์ด ์กฐํ API ์์ฑ (21/09/08) - `commit` : [d30b71d](https://github.com/vividswan/K.Cook-Server/commit/d30b71d68fc6b72fb4266fba9ab6b4266c9b995b)
- ๊ด๋ฆฌ์ ๊ถํ์ผ๋ก ํ์ Role ๋ณ๊ฒฝ API ์์ฑ (21/09/08) - `commit` : [fb8f56f](https://github.com/vividswan/K.Cook-Server/commit/fb8f56f572d0dd034c856218097525deef910f04)
- Store ์์ฑ, ์์  API ์์ฑ (21/09/09) - `commit` : [8da80bc](https://github.com/vividswan/K.Cook-Server/commit/8da80bce7c556c4101fb398d67f172605c0f8abf), [a24bc2b](https://github.com/vividswan/K.Cook-Server/commit/a24bc2b2b82d50f0be0ec6e1803b983b6bc452f8)
- Product Detail ์กฐํ API ํตํฉํ์คํธ ์ฝ๋ ์์ฑ (21/09/10) - `commit` : [4400cc6](https://github.com/vividswan/K.Cook-Server/commit/4400cc651818cd04363efad146a52a8a591b4fca)
- Product ์์ฑ API ์์ฑ (21/09/13) - `commit` : [4477731](https://github.com/vividswan/K.Cook-Server/commit/4477731f2345bef774df05783932552c1d577ef5), [d518792](https://github.com/vividswan/K.Cook-Server/commit/d518792f5dd720a3b51253c78e66d9ba5d102ccb), [3c2243e](https://github.com/vividswan/K.Cook-Server/commit/3c2243eaa1d8ab2cb5c9030442350f125bca51d1)
- ๋ฐฑ์๋ ๋น๋ ๋ฐ ๋ฐฐํฌ ์๋ํ(์ฐํจ์ค, ๋์ปค) (21/09/21) : [์์คํ ๊ตฌ์๋](https://user-images.githubusercontent.com/54254402/134108670-568b2458-b80b-4706-a27b-c027e7aa7d1e.png)
- ๊ณ์ ์ ์ฟ ํฐ ์กฐํ API ์์ฑ (21/09/30) - `commit` : [1492cb9](https://github.com/vividswan/K.Cook-Server/commit/1492cb91a933c76e5c7448623b6b6ddceb1fa5dc)
- ๋ก๊ทธ์ธ ํ ํ์์ ์ฌ์ฉ API ๋ก๊ทธ ์ ์ฅ ๊ธฐ๋ฅ ์ถ๊ฐ(`Spring AOP`) (21/10/06) - `commit` : [2b387bc](https://github.com/vividswan/K.Cook-Server/commit/2b387bc42bcea2982078ff9a3ae2b54a7913537b)



## Author

๐ค **vividswan**

* Website: vividswan.github.io
* Github: [@vividswan](https://github.com/vividswan)

## ๐ค Contributing

Contributions, issues and feature requests are welcome!<br />Feel free to check [issues page](https://github.com/vividswan/K.Cook-Server/issues). 

## Show your support

Give a โญ๏ธ if this project helped you!

## ๐ License

Copyright ยฉ 2021 [vividswan](https://github.com/vividswan).<br />
This project is [MIT](https://github.com/vividswan/K.Cook-Server/blob/main/LICENSE) licensed.

***
_This README was generated with โค๏ธ by [readme-md-generator](https://github.com/kefranabg/readme-md-generator)_
