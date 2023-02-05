import java.util.Scanner;
public class MidValue {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 3개 입력 >>");
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		
		int result = 0;
		
		if(num1 > num2) {
			if(num3 > num1)
				result = num1;
			else
				result = (num3 < num2) ? num2 : num3;
		}
		else {
			if(num3 > num2)
				result = num2;
			else
				result = (num3 < num1) ? num1 : num3;
		}
		
		System.out.println("중간 값은 " + result);
		
		scanner.close();
	}
}
