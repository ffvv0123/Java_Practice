import java.util.Scanner;
public class GreedyMoney {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("금액을 입력하시오 >>");
		int money = scanner.nextInt();

		if (money / 50000 != 0) {
			System.out.println("오만원권 " + money / 50000 + "매");
			money %= 50000;
		}

		if (money / 10000 != 0) {
			System.out.println("만원권 " + money / 10000 + "매");
			money %= 10000;
		}

		if (money / 1000 != 0) {
			System.out.println("천원권 " + money / 1000 + "매");
			money %= 1000;
		}

		if (money / 100 != 0) {
			System.out.println("백원 " + money / 100 + "개");
			money %= 100;
		}

		if (money / 50 != 0) {
			System.out.println("오십원 " + money / 50 + "개");
			money %= 50;
		}

		if (money / 10 != 0) {
			System.out.println("십원 " + money / 10 + "개");
			money %= 10;
		}

		if (money != 0)
			System.out.println("일원 " + money + "개");
		
		scanner.close();
	}
}
