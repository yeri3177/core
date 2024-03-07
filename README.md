# 🌿스프링 핵심 원리 - 기본편

이 저장소는 인프런 강의 "스프링 핵심 원리 - 기본편"을 수강하면서 진행한 실습 프로젝트입니다. 해당 강의를 통해 스프링의 핵심 원리를 이해하고 실습할 수 있습니다.

## 프로젝트 소개

이 프로젝트는 스프링에서 중요한 객체 지향 설계와 스프링의 핵심 원리 및 기능을 학습하는 내용입니다.

## 강의 섹션 및 내용

### 섹션 0. 강의 소개
- 강의 소개

### 섹션 1. 객체 지향 설계와 스프링
1. 이야기 - 자바 진영의 추운 겨울과 스프링의 탄생
2. 스프링이란?
3. 좋은 객체 지향 프로그래밍이란?
4. 좋은 객체 지향 설계의 5가지 원칙(SOLID)
5. 객체 지향 설계와 스프링

### 섹션 2. 스프링 핵심 원리 이해1 - 예제 만들기
1. 프로젝트 생성
2. 비즈니스 요구사항과 설계
3. 회원 도메인 설계
4. 회원 도메인 개발
5. 회원 도메인 실행과 테스트
6. 주문과 할인 도메인 설계
7. 주문과 할인 도메인 개발
8. 주문과 할인 도메인 실행과 테스트

### 섹션 3. 스프링 핵심 원리 이해2 - 객체 지향 원리 적용
1. 새로운 할인 정책 개발
2. 새로운 할인 정책 적용과 문제점
3. 관심사의 분리
4. AppConfig 리팩터링
5. 새로운 구조와 할인 정책 적용
6. 전체 흐름 정리
7. 좋은 객체 지향 설계의 5가지 원칙의 적용
8. IoC, DI, 그리고 컨테이너
9. 스프링으로 전환하기

### 섹션 4. 스프링 컨테이너와 스프링 빈
1. 스프링 컨테이너 생성
2. 컨테이너에 등록된 모든 빈 조회
3. 스프링 빈 조회 - 기본
4. 스프링 빈 조회 - 동일한 타입이 둘 이상
5. 스프링 빈 조회 - 상속 관계
6. BeanFactory와 ApplicationContext
7. 다양한 설정 형식 지원 - 자바 코드, XML
8. 스프링 빈 설정 메타 정보 - BeanDefinition

### 섹션 5. 싱글톤 컨테이너
1. 웹 애플리케이션과 싱글톤
2. 싱글톤 패턴
3. 싱글톤 컨테이너
4. 싱글톤 방식의 주의점
5. @Configuration과 싱글톤
6. @Configuration과 바이트코드 조작의 마법

### 섹션 6. 컴포넌트 스캔
1. 컴포넌트 스캔과 의존관계 자동 주입 시작하기
2. 탐색 위치와 기본 스캔 대상
3. 필터
4. 중복 등록과 충돌

### 섹션 7. 의존관계 자동 주입
1. 다양한 의존관계 주입 방법
2. 옵션 처리
3. 생성자 주입을 선택해라!
4. 롬복과 최신 트랜드
5. 조회 빈이 2개 이상 - 문제
6. @Autowired 필드 명, @Qualifier, @Primary
7. 애노테이션 직접 만들기
8. 조회한 빈이 모두 필요할 때, List, Map
9. 자동, 수동의 올바른 실무 운영 기준

### 섹션 8. 빈 생명주기 콜백
1. 빈 생명주기 콜백 시작
2. 인터페이스 InitializingBean, DisposableBean
3. 빈 등록 초기화, 소멸 메서드
4. 애노테이션 @PostConstruct, @PreDestroy

### 섹션 9. 빈 스코프
1. 빈 스코프란?
2. 프로토타입 스코프
3. 프로토타입 스코프 - 싱글톤 빈과 함께 사용시 문제점
4. 프로토타입 스코프 - 싱글톤 빈과 함께 사용시 Provider로 문제 해결
5. 웹 스코프
6. request 스코프 예제 만들기
7. 스코프와 Provider
8. 스코프와 프록시

### 섹션 10. 다음으로
1. 다음으로

## 실습 환경

- Java 17
- Spring Boot 3.2.3
- Gradle
- IntelliJ IDEA

## 학습기간
2024.03.04 ~ 진행중
