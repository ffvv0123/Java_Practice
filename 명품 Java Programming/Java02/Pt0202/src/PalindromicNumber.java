/*
 * Title: PalindromicNumber.java
 * Author: Suhyeon Jo
 * Date: 2023-02-05
 * 실습문제 2-2
 */
import java.util.Scanner;
public class PalindromicNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("2자리수 정수 입력(10~99) >> ");
		
		int figure = scanner.nextInt();
		int digitTen = figure / 10;
		int digitOne = figure % 10;
		
		if(digitTen == digitOne)
			System.out.println("Yes! " + figure + "는 10의 자리와 1의 자리가 같습니다.");
		else
			System.out.println("Nope! " + figure + "는 10의 자리와 1의 자리가 다릅니다.");
		
		scanner.close();
	}
}
