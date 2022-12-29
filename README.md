# MVC 프레임워크 만들기

## 1. Reflection API 개념 소개 및 실습

### Reflection API 란?
> - `Heap` 영역에 로드되어 있는 클래스 타입의 객체를 통해 필드/메서드/생성자를 접근제어자와 상관없이 사용할 수 있도록 지원하는 `API`
> - `Compile` 시점이 아닌 `Runtime` 시점에 동적으로 특정 클래스의 정보를 추출해낼 수 있는 프로그래밍 기법
> - 주로 프레임워크 또는 라이브러리 개발 시 사용됨
> - https://www.baeldung.com/reflections-library
<hr>


### Reflection API 를 사용하는 프레임워크/라이브러리 소개
> - `Spring` 프레임워크 `(ex. DI)`
> - `Test` 프레임워크 `(ex. JUnit)`
> - `JSON Serialization/Deserialiazation` 라이브러리 (ex. Jackson)
> - 기타 등등
<hr>

### 실습 내용
> - `@Controller` `Annotation` 이 설정되어 있는 모든 클래스를 찾아서 출력한다.
> - `@Service` `Annotation` 이 설정되어 있는 모든 클래스를 찾아서 출력한다.
> - `Heap` 영역에 로드되어 있는 클래스 타입의 객체를 통해 필드/메서드/생성자 추출
