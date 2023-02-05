/*
 * Title: CurrencyExchange.java
 * Author: Suhyeon Jo
 * Date: 2023-02-05
 * 실습문제 2-1
 */
import java.util.Scanner;
public class CurrencyExchange {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("원화를 입력하세요(단위 원)>>");
		int Won = scanner.nextInt();
		
		double dollar = (double)Won / 1100;
		System.out.printf(Won + "원은 $" + "%.2f" + "입니다.", dollar);
		
		scanner.close();
	}
}
