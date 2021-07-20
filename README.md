## Requirements

- Java 8
- Gradle 7.0.2



## Gradle
Groovy 언어 기반으로 만들어진 빌드 도구(스크립트)

- plugins
- repositories
    - jcenter() : JCenter라는 저장소
    - mavenCentral() : Apach Maven 중앙 저장소
- dependencies : https://docs.gradle.org/current/userguide/java_plugin.html#sec:java_plugin_and_dependency_management
    - spring-boot-starter-web (exclude spring-boot-starter-tomcat)
    - spring-boot-starter-undertow : Embedded Server
    - spring-boot-starter-security : https://spring.io/guides/gs/securing-web/
    - spring-boot-starter-validation : https://spring.io/guides/gs/validating-form-input/
    - spring-boot-starter-aop : https://www.baeldung.com/spring-aop
        - AOP : 기능을 비지니스 로직과 공통 모듈로 구분한 후, 필요한 시점에 비지니스 로직에 삽입하여 실행
            - 언제 사용하는가?
                - 트랜잭션 처리
                - 로깅
                - 예외반환
                - 검증
                - 성능 검사
                - ...
        - aspect : 여러 클래스에서 걸쳐있는 관심사의 모듈(공통모듈)
        - joinpoint : 메소드 실행
        - pointcut : 특정 joinpoint에 적용될 aspect 매칭
        - advice
            - `@Before` : joinpoint 전에 실행
            - `@AfterReturning` : joinpoint에서 성공적으로 리턴된 후 실행
            - `@AfterThrowing` : 에외가 발생하였을 경우 실행
            - `@After` : joinpoint에서 메소드의 샐행결과에 상관없이 무조건 실행
            - `@Around` : joinpoint의 전 과정(전, 후)에 수행
      > https://jeong-pro.tistory.com/171, https://www.baeldung.com/spring-aop-annotation,

    - spring-boot-starter-data-jpa : https://spring.io/guides/gs/accessing-data-jpa/
        - ojdbc8 : https://spring.io/guides/gs/accessing-data-mysql/
        - HikariCP : lightning-fast JDBC connection pooling framework
    - spring-boot-starter-test : https://spring.io/guides/gs/spring-boot/
    - spring-boot-devtools : https://docs.spring.io/spring-boot/docs/current/reference/html/using.html#using.devtools
    - mapstruct : https://mapstruct.org/
    - lombok : https://objectcomputing.com/resources/publications/sett/january-2010-reducing-boilerplate-code-with-project-lombok
    - querydsl :
        - JPA
            - Repository 인터페이스는 JPARepository를 확장해 구현
            - JPARepository는 CRUD 및 페이징 구현이 모두 되어 있음
        - querydsl
            - Repository 인터페이스에 JPARepository, RepositoryCustom 확장해 구현
            - RepositoryCustom 인터페이스에 필요한 기능 정의
            - RepositoryImpl 클래스에 RepositoryCustom 기능을 queryDsl로 구현
    - springdoc : https://springdoc.org/#getting-started