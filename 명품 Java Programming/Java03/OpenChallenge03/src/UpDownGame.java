import java.util.Scanner;
import java.util.Random;

public class UpDownGame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random r = new Random();
		
		while(true) {
			int k = r.nextInt(100);
			int start = 0;
			int end = 99;
			int cnt = 1;			
			System.out.println("수를 결정하였습니다. 맞추어 보세요");
			
			while(true) {
				System.out.println(start + "-" + end);
				System.out.print(cnt + ">>");
				int val = scanner.nextInt();
				
				if(val > k) {
					System.out.println("더 낮게");
					end = val;
				}
				
				else if(val < k) {
					System.out.println("더 높게");
					start = val;
				}
				
				else {
					System.out.println("맞았습니다.");
					break;
				}
				cnt++;
			}
			
			System.out.print("다시하시겠습니까(y/n)>>");
			String replay = scanner.next();
			
			if(replay.equals("n"))
				break;
		}
	}
}
