/*
 * Title: ScannerEx.java
 * Author: Suhyeon Jo
 * Date: 2023-02-05
 * ScannerEx
 */
import java.util.Scanner;
public class ScannerEx {
	public static void main(String[] args) {
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요");
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next();
		System.out.print("이름은 " + name + ", ");
		
		String city = scanner.next();
		System.out.print("도시는 " + city + ", ");
		
		int age = scanner.nextInt();
		System.out.print("나이는 " + age + "살, ");
		
		double weight = scanner.nextDouble();
		System.out.print("체중은 " + weight + "kg, ");
		
		boolean isSingle = scanner.nextBoolean();
		System.out.print("독신 여부는 " + isSingle + "입니다.");
		scanner.close();
	}
}


/*
 * System.in
 *  - 키보드 장치를 직접 제어하고 키 입력을 받는 표준 입력 스트림 객체
 *  - 단순한 바이트 정보를 응용 프로그램에 전달 -> 응용 프로그램에서 변환과정 필요 -> Scanner 클래스 쓰는게 이
 * 
 * Scanner
 *  - 자바 패키지에서 제공하는 클래스
 *  - 객체 생성
 *   Scanner scanner = new Scanner(System.in);
 *  - import문 사용
 *   import java.util.Scanner;
 *  - Scanner 클래스로 키 입력받기: 공백으로 구분된 토큰 단위로 끊어 읽음 
 *   String name = scanner.next();
 *   String city = scanner.next();
 *   int age = scanner.nextInt();
 *   double weight = scanner.nextDouble();
 *   boolean isSingle = scanner.nextBoolean();
 *   
 * Scanner 클래스의 주요 메소드
 *  - String next()			// 다음 토큰을 문자열로 리턴
 *  - byte nextByte()		// 다음 토큰을 byte타입으로 리턴
 *  - short nextShort()		// 다음 토큰을 short타입으로 리턴
 *  - int nextInt()			// 다음 토큰을 int타입으로 리턴
 *  - long nextLong()		// 다음 토큰을 long타입으로 리턴
 *  - float nextFloat()		// 다음 토큰을 float타입으로 리턴
 *  - double nextDouble()	// 다음 토큰을 double타입으로 리턴
 *  - boolean nextBoolean()	// 다음 토큰을 boolean타입으로 리턴
 *  - String nextLine()		// '\n'을 포함하는 한 라인을 읽고, '\n'을 버린 나머지 문자열을 리턴
 *  - void close()			// Scanner 사용 종료
 *  - boolean hasNext()		// 현재 입력된 토큰이 있으면 true, 아니면 입력 때까지 한무대기. 새로운 입력이 들어오면 true, ctrl+z -> false
 *  
 * nextLine()과 next()
 *  - 공백을 포함한 문자열을 입력받을 떄: nextLine() 사용
 *  - <Enter>키의 입력을 기다리는 용도
 *  - 입력 없이 엔터만 들어오면, "" 리턴
 *  - next(): 공백을 읽을 수 없음 -> 엔터를 쳐도 다른 키가 입력될 때 까지 기다림 -> ""리턴 없음
 *  
 * Scanner 객체 닫기
 *  - 객체 다 쓰면 종료한다. -> 안하면 컴파일 경고
 *   scanner.close();
 *   scanner = new Scanner(System.in) // scanner를 닫은 후 다시 scanner로 키 입력 불가
 *   
 * Scanner 객체는 하나만 생성하고 공유하는것이 바람직하다고 하네. 결국은 하나의 System.in을 공유하기 때문
 *   
 * 
 * 
 * 
 * 
 * 
 */
