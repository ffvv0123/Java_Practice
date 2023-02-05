/*
 * Title: DataType.java
 * Author: Suhyeon Jo
 * Date: 2023-02-04
 * Variable, Literal, Constant
 */
public class DataType {
	public static void main(String[] args) {
		final double PI = 3.14;	// pi is constant

		double radius = 10.0;	// radius
		double circleArea = radius * radius * PI; // surface calculate
		
		// Print surface of circle at the screen.
		System.out.println("원의 면적 = " + circleArea);
	}
}

/*
 * 기본 데이터 타입(Basic Data Type): 8개
 *  - boolean	// 논리값 1bit	// true or false
 *  - char		// 문자 2byte		// Unicode
 *  - byte		// 정수 1byte		// -128 ~ 127 
 *  - short		// 정수 2byte		// -32768 ~ 32767
 *  - int		// 정수 4byte		// -2^31 ~ 2^31 - 1
 *  - long		// 정수 8byte		// -2^63 ~ 2^63 - 1
 *  - float		// 실수 4byte		// -3.4E38 ~ 3.4E38
 *  - double	// 실수 8byte		// -1.7E308 ~ 1.7E308
 *  
 *  -> 자바에서는 어떠한 조건에서도 데이터 타입의 크기가 일정하다.
 *
 * 레퍼런스 타입(reference type): 1개
 *  - 용도가 3가지
 *  - 배열에 대한 레퍼런스
 *  - 클래스에 대한 레퍼런스
 *  - 인터페이스에 대한 레퍼런스
 *  
 * 문자열
 *  - 기본 타입이 아님 -> JDK에서 제공하는 String 클래스를 이용
 *  - 문자열과 기본 타입의 + 연산이 이루어지면 기본 타입의 값이 문자열로 바뀌고 두 문자열이 연결된 새로운 문자열이 만들어짐 
 * 
 * 변수의 선언 -> 느낌있게 걍 해
 * 
 * 리터럴(literal)
 *  - 정수 리터럴은 int타입으로 자동 컴파일 됨 -> long타입으로 지정하려면 숫자 뒤에 l이나 L을 붙인다.
 *   int n = 15;		// 십진수 	
 *   int m = 015;		// 8진수 
 *   int k = 0x15;		// 16진수 
 *   int b = 0b0101;	// 2진수 
 *   int g = 24L;
 * 
 *  - 실수 리터럴은 double타입으로 자동 컴파일 됨 -> float으로 지정하려면 f, F, double로 지정하려면 d, D를 붙인다.
 *   double d = 0.1234;
 *   double e = 1234E-4;
 *   float f = 0.1234f;	// f = 0.1234 -> compile error
 *   double w = .1234D;	// .1234D = .1234
 *  
 *  - 문자 리터럴은 단일 인용부호(' ')로 문자를 표현하거나, \ u 다음에 문자의 유니코드 값을 사용하여 표현한다.
 *   char a = 'A';
 *   char b = '글';
 *   char c = \u0041;	// 문자 A의 유니코드 
 *   char d = \uae00;	// 문자 a의 유니코드
 *  
 *  - 특수문자 리터럴 = 이스케이프 시퀀스(escape sequence)
 *  - '\b' backspace
 *  - '\t' tab
 *  - '\n' line feed
 *  - '\f' form feed
 *  - '\r' carriage return
 *  - '\"' double quote
 *  - '\'' single quote
 *  - '\\' backslash
 *  
 *  - 논리 리터럴: true, false 두가지 
 *   boolean a = true;
 *   boolean b = 10 > 0;	// 참이므로 b = true
 *   boolean c = 1;			// 타입 불일치 에러 -> java에서는 숫자로 참 거짓을 표현 못 함
 *   while(true) {}  		// 무한루프, while(1)은 안된다.
 *  
 *  - null 리터럴: 기본 타입에 사용될 수 없고, 객체 레퍼런스에 대입
 *   int n = null;		// 오류 -> 기본 타입에 사용 불가
 *   String str = null;	// 정상
 *   
 *  - String 리터럴(문자열 리터럴): ""로 사용
 *  - 문자열 리터럴을 포함한 모든 문자열은 String 클래스의 객체
 *   String str = "Good";
 *   
 *  변수 타입 생략 -> var 키워드 사용
 *  - Java 10 부터 지역 변수를 선언할 때 var 키워드 사용 가능 -> 초기화 되지 않으면 사용 불가
 *  
 *   var price = 200;
 *   var name = "suhyeon";
 *   var pi = 3.14
 *   var point = new Point();
 *   var v = new Vector<Integer>();	
 *   var name;	// 초깃값 없으니 안된다
 *  
 * 상수
 *  - 변수 선언 시 final 키워드를 붙여주면 상수가 된다.
 *   final double PI = 3.141592;
 */
