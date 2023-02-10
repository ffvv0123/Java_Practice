import java.util.Scanner;

public class PrintReverseStar {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);

		System.out.print("정수를 입력하시오>>");
		int num = sn.nextInt();

		for (int i = num; i >= 0; i--) {
			for (int j = 0; j < i; j++)
				System.out.print("*");
			System.out.println();
		}

		sn.close();
	}
}
