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
<hr>

## 2. Front Controller 개념 소개 및 실습

### Front Controller 패턴
> - 모든 요청을 단일 `Handler` (처리기) 에서 처리하도록 하는 패턴
> - 스프링 웹 MVC 프레임워크의 `DispatcherServlet` (`Front Controller` 역할) 이 프런트 컨트롤러 패턴으로 구현되어 있음
<hr>

### Forward
> - 서블릿에서 클라이언트 (웹 브라우저) 를 거치지 않고 바로 다른 서블릿 (또는 `JSP`) 에게 요청하는 방식
> - `Forward` 방식은 서버 내부에서 일어나는 요청이기 때문에 `HttpServletRequest`, `HttpServletResponse` 객체가 새롭게 생성되지 않음 (공유됨)
> ```java
> RequestDispatcher dispatcher = request.getRequestDispatcher("포워드 할 서블릿 또는 JSP");
> dispatcher.forward(request, response);
> ```
<hr>

### Redirect
> - 서블릿이 클라이언트 (웹 브라우저) 를 다시 거쳐 다른 서블릿 (또는 `JSP`) 에게 요청하는 방식
> - `Redirect` 방식은 클라이언트로부터 새로운 요청이기 때문에 새로운 `HttpServletRequest`, `HttpServletResponse` 객체가 생성됨
> - `HttpServletResponse` 객체의 `sendRedirect()` 이용