/*
 * Title: Casting.java
 * Author: Suhyeon Jo
 * Date: 2023-02-04
 * Casting
 */
public class Casting {
	public static void main(String[] args) {
		byte b = 127;
		int i = 100;
		System.out.println(b + i);
		System.out.println(10 / 4);
		System.out.println(10.0 / 4);
		System.out.println((char) 0x12340041);
		System.out.println((byte) (b + i));
		System.out.println((int) 2.9 + 1.8);
		System.out.println((int) (2.9 + 1.8));
		System.out.println((int) 2.9 + (int) 1.8);
	}
}

/*
* 타입 변환(Casting): 변수나 상수, 리터럴의 타입을 다른 타입으로 바꾸는 것
* - 자동 타입 변환: 치환문(=)이나 수식 내에서 타입이 일치하지 않으면, 컴파일러는 에러 대신 작은 타입을 큰 타입으로 캐스팅한다
*  long m = 25;				// 리터럴 25는 int타입 -> 25가 long으로 자동 변환
*  double d = 3.14 * 10;	// 실수 연산을 하기 위해 10이 자동으로 10.0으로 변환
* 
* - 강제 타입 변환
*  int n = 300;
*  byte b = n;	// Compile error: int타입은 byte타입으로 캐스팅 불가능 -> 값이 깨지기 때문
*  
* - 알고도 바꾸고 싶으면 ()안에 타입을 명시해서 강제 타입 변환을 지시한다.
*  byte b = (byte)n; // n을 강제로 byte로 변환 b = 44
* 
*  double d = 1.9;
*  int n = (int)d;	// n = 1
*  
*  -> 데이터 손실이 생긴다.
*/
