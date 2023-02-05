import java.util.Scanner;
import java.lang.Math;
public class IsCircleOverlap {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 번째 원의 중심과 반지름 입력 >>");
		int pointX1 = scanner.nextInt();
		int pointY1 = scanner.nextInt();
		double radius1 = scanner.nextDouble();
		
		System.out.print("두 번째 원의 중심과 반지름 입력 >>");
		int pointX2 = scanner.nextInt();
		int pointY2 = scanner.nextInt();
		double radius2 = scanner.nextDouble();
		
		double distancePoint = Math.sqrt(Math.pow(pointX2 - pointX1, 2) + Math.pow(pointY2 - pointY1, 2));
		
		if(distancePoint < radius1 + radius2)
			System.out.println("두 원은 겹친다.");
		else
			System.out.println("두 원은 겹치지 않는다.");
		
		scanner.close();
	}
}
