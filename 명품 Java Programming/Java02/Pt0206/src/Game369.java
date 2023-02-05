import java.util.Scanner;
public class Game369 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1~99 사이의 정수를 입력하시오 >>");
		int value = scanner.nextInt();
		
		int count = 0;
		int digitTen = value / 10;
		int digitOne = value % 10;
		
		if(digitTen % 3 == 0) count++;
		if(digitOne % 3 == 0) count++;
		
		switch(count) {
			case 1:
				System.out.println("박수짝");
				break;
			case 2:
				System.out.println("박수짝짝");
				break;
			default: System.out.println("박수를 치지 않습니다.");	
		}
		scanner.close();
	}
}
