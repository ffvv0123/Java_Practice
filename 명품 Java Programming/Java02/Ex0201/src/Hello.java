/*
 * Title: hello.java
 * Author: Suhyeon Jo
 * Date: 2023-02-04
 * Basic structures of java program
 */
public class Hello {
	
	public static int sum(int n, int m) { 	// 매개변수 n, m
		return n + m;						// n + m 리턴
	}
	
	// main() 메소드에서 실행 시작
	public static void main(String[] args) {
		int i = 20;
		int s;
		char a;
		
		s = sum(i, 10);					// 메소드 호출
		a = '?';						
		System.out.println(a);			// 문자 '?' 출력
		System.out.println("Hello");	// Hello" 문자열 출력
		System.out.println(s);			// 정수 s값 30 출력
	}
}

/*
 * 클래스 만들기
 *  - 클래스 내부에 모든 프로그램 요소를 작성한다.
 *  - 클래스 밖에는 어떤 것도 작성할 수 없다.
 * 
 *  - class 키워드로 클래스 이름 선언, {} 사이에 필드(변수)와 메소드(함수) 코드 작성
 *  - public: 자바의 접근지정자(access specifier) -> 다른 모든 클래스에서 Hello 클래스를 자유롭게 사용할 수 있다는 선언
 * 
 * 주석
 *  - 한 라인 주석 //
 *  - 여러 라인 주석 /* * /로 구성
 *  
 * main 메소드
 *  - main()은 반드시 public, static, void 타입으로 선언. 한 클래스에 두 개 이상의 main()은 안 됨.
 *  - 여러 개의 클래스가 있어도, 실행할 클래스에만 main이 있으면 되므로, 모든 클래스에 main이 존재할 필요는 없다.
 *  
 * 메소드
 *  - 클래스의 멤버 함수 -> 메소드(method)
 *  - 메소드의 갯수에는 제한이 없다
 *  - 메소드 선언에 사용되는 변수를 매개변수(parameter)라고 한다.
 *  
 * 변수
 *  - 변수(variable): 프로그램 실행 동안 데이터를 저장하는 공간
 *  - 메소드 내에서 선언되면 -> 지역변수(local variable) -> 메소드 내에서만 사용, 메소드가 종료되면 소멸
 *  
 * 문장
 *  - ;로 끝난다 -> 여러 줄에 걸쳐서 작성해도 ;만 끝에 쓰면 인식이 잘 됨
 *  
 * 화면 출력
 *  - System.out.print(): 출력 후 다음 줄로 넘어가지 않음
 *  - System.out.println(): 출력 후 다음 줄로 넘어감
 *  
 * 식별자
 *  - 특수문자, 공백은 사용할 수 없음 -> _ $ <- 가능
 *  - 한글도 식별자로 사용 가능
 *  - 자바 언어의 키워드는 식별자로 사용 불가
 *  - 식별자의 첫 문자로 숫자 못 씀
 *  - _ $ <- 첫 문자로 사용할 수 있음
 *  - 대소문자 구별
 *  - 길이 제한 없음
 *  
 * 국룰
 *  - 클래스 이름: 대문자로 시작, 띄어쓰기 없이 각 단어의 첫 글자만 대문자로 씀
 *  - 변수, 메소드 이름: 첫 단어는 소문자로 표기, 이후 각 단어의 첫 글자를 대문자로 씀
 *  - 상수: 대문자로 씀 
 */
