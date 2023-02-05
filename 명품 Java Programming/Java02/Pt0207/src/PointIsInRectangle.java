import java.util.Scanner;
public class PointIsInRectangle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점 (x, y)의 좌표를 입력하시오 >>");
		int pointX = scanner.nextInt();
		int pointY = scanner.nextInt();
		
		if(pointX >= 100 && pointX <= 200 && pointY >= 100 && pointY <= 200)
			System.out.printf("(%d, %d)는 사각형 안에 있습니다.", pointX, pointY);
		else
			System.out.printf("(%d, %d)는 사각형 안에 없습니다.", pointX, pointY);
		
		scanner.close();
	}
}
