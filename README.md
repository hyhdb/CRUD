Spring Boot 기본기 & POST 요청 실습

🚀 개요

Day 1에서는 Spring Boot 백엔드 개발의 기본 구조를 익히고
Controller / Service 분리, JSON 입력, POST 요청 처리까지 실습

📂 프로젝트 구조

- Controller: 클라이언트 요청을 받는 레이어

- Service: 실제 비즈니스 로직이 들어가는 레이어

- DTO: 요청/응답 데이터를 담는 객체

- Repository: (Day 2에서는 미사용) DB 연결용 구조

🎯 Day 1 학습 목표

- Spring Boot 기본 디렉토리 구조 이해

- Controller → Service 흐름 익히기

- DTO를 통해 JSON Request 받기

- Postman을 이용한 POST API 테스트

🛠 실행 방법

1. 프로젝트 실행 : ./gradlew bootRun 또는 IntelliJ에서 CrudApplication 실행

서버 구동: http://localhost:8080

📮 Postman 테스트
✔ POST 요청 보내기

- URL:  POST http://localhost:8080/users/create


- Header: Content-Type: application/json


- Body (raw / JSON): 
{
"name": "홍길동",
"age": 25
}


- 결과: 서버가 요청받은 데이터를 기반으로 성공 메시지를 반환

📘 요약

- Spring Boot의 3계층 구조 (Controller / Service / DTO)

- JSON 기반 POST 요청 처리

- Postman을 활용한 API 테스트 방법

- 패키지 구조 설계 방법