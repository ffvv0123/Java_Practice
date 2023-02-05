import java.util.Scanner;
public class IsCrush {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점 (x1, y1)의 좌표를 입력하시오 >>");
		int pointX1 = scanner.nextInt();
		int pointY1 = scanner.nextInt();
		
		System.out.print("점 (x2, y2)의 좌표를 입력하시오 >>");
		int pointX2 = scanner.nextInt();
		int pointY2 = scanner.nextInt();
		
		if(inRect(100, 200, pointX1, pointY1, pointX2, pointY2) == false)
			System.out.println("두 직사각형은 충돌하지 않습니다.");
		else System.out.println("두 직사각형은 충돌합니다.");
		
		scanner.close();
		
	}
	public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
		if((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2))
			return true;
		else return false;
	}
}