import java.util.Scanner;
public class IsTriangle {
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 3개를 입력하시오>>");
		
		int side1 = scanner.nextInt();
		int side2 = scanner.nextInt();
		int side3 = scanner.nextInt();
		
		// 두 변의 길이의 합이 다른 한 변의 길이보다 크다.
		int sumSide = side1 + side2 + side3;
		int maxSide = (side1 > side2) ? side1 : side2;
		maxSide = (maxSide > side3) ? maxSide : side3;
		
		if(sumSide - maxSide > maxSide)
			System.out.println("삼각형이 됩니다.");
		else System.out.println("삼각형이 되지 않습니다.");
	}
}
