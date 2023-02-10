import java.util.Scanner;

public class GreedyMoney {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] unit = { 50000, 10000, 1000, 500, 100, 50, 10, 1 };

		System.out.print("금액을 입력하시오>>");
		int money = scanner.nextInt();

		for (int i : unit) {
			if (money / i != 0)
				System.out.println(i + "원 짜리 : " + money / i + "개");
			money %= i;
		}
		scanner.close();
	}
}
