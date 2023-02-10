import java.util.Scanner;
public class PrintReverseAlphabet {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		char alphabet = scanner.next().charAt(0);	// ASCII 코드를 이용한 문제풀이 -> char로 받는게 편하다.
		
		for(int i = (int)alphabet - (int)'a' + 1; i >=0; i--) {	// 1차 반복 -> 문장의 수 -> 아스키코드의 차(입력 - a) + 1
			for(int j = 0; j<i; j++)
				System.out.print((char)((int)'a' + j));			// 2차 반복 -> 출력은 1차 반복에 종속 -> ASCII to CHAR
			System.out.println();
		}
	}
}
