import java.util.Scanner;
import java.lang.Math;
public class PointIsInCircle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("원의 중심과 반지름 입력 >>");
		int centerX = scanner.nextInt();
		int centerY = scanner.nextInt();
		double radius = scanner.nextDouble();
		
		System.out.println("점 입력 >>");
		double pointX = scanner.nextDouble();
		double pointY = scanner.nextDouble();
		
		double distance = Math.sqrt(Math.pow(pointX - centerX, 2) + Math.pow(pointY - centerY, 2));
		
		if(distance <= radius)
			System.out.printf("점 (%.1f, %.1f)는 원 안에 있다.\n", pointX, pointY);
		else
			System.out.printf("점 (%.1f, %.1f)는 원 밖에 있다.\n", pointX, pointY);
		
		scanner.close();
	}
}
