import java.util.Scanner;

public class MultipleOf3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arr[] = new int[10];

		System.out.print("양의 정수 10개를 입력하시오>>");
		for (int i = 0; i < 10; i++)
			arr[i] = scanner.nextInt();

		System.out.print("3의 배수는 ");

		for (int i : arr) {
			if (i % 3 == 0)
				System.out.print(i + " ");
		}
	}
}
