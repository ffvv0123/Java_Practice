import java.util.Scanner;
import java.lang.Math;

public class UniqueRandomNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("정수 몇 개?");
		int cnt = scanner.nextInt();

		boolean isUnique[] = new boolean[100];
		int arr[] = new int[cnt];

		for (int i = 0; i < cnt; i++) {
			int tmp = (int) (Math.random() * 100);
			if (isUnique[tmp] == true)
				i--;
			else {
				arr[i] = tmp + 1;
				isUnique[tmp] = true;
			}
		}

		for (int i = 0; i < cnt; i++) {
			System.out.print(arr[i] + " ");
			if (i % 10 == 9)
				System.out.println();
		}
	}
}
