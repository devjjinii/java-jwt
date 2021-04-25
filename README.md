## Json Web Token

* https://jwt.io/
* https://www.inflearn.com/course/스프링부트-jwt
---
* Header, Payload, Signature 로 구성
  * Header : 시그니처를 해싱하기 위한 알고리즘 정보
  * Payload : 서버와 클라이언트가 주고받는 정보
  * Signature : 토큰의 유효성 검증을 위한 문자열

* 장점
  * 중앙의 인증서버, 데이터 스토어에 대한 의존성이 없음, 시스템 수평 확장 용이
  * Base64 URL Encoding -> URL, Cookie, Header 모두 사용 가능 (범용성)
* 단점
  * Payload 에 저장하는 정보가 많아지면 네트워크 트래픽 증가
  * 토큰이 클라이언트에 저장, 서버에서 클라이언트의 토큰을 조작할 수 없음
  
  

