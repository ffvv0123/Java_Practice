import java.util.Scanner;
import java.util.InputMismatchException;

public class Multiply {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<5; i++) {
			System.out.print("곱하고자 하는 두 수 입력>>");
		
			try {
				int n = scanner.nextInt();
				int m = scanner.nextInt();
				System.out.printf("%dx%d=%d\n",n, m, n*m);
			}
			catch(InputMismatchException e) {
				System.out.println("실수는 입력하면 안됩니다.");
				scanner.nextLine();
				i--;
				continue;
			}
		}
		
		scanner.close();
	}
}
