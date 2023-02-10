import java.util.Scanner;

public class DivideByZeroHandling {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("나뉨수를 입력하시오: ");
			int dividend = scanner.nextInt();

			System.out.print("나눗수를 입력하시오: ");
			int divisor = scanner.nextInt();

			try {
				System.out.printf("%d를 %d로 나누면 몫은 %d 입니다.", dividend, divisor, dividend / divisor);
				break;
			}

			catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다! 다시 입력하세요");
			}
		}

		scanner.close();
	}
}
