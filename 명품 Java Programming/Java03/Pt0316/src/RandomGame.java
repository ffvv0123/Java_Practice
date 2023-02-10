import java.util.Scanner;
import java.lang.Math;

public class RandomGame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String str[] = {"가위", "바위", "보"};
		
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		
		while(true) {
			System.out.print("가위 바위 보!>>");
			String user = scanner.next();	// 사용자가 낸 것 or 게임 종료  
			
			if(user.equals("그만")) {			// 게임 종료 
				System.out.println("게임을 종료합니다...");	
				break;
			}
			
			int n = (int)(Math.random()*3);
			String computer = str[n];		// 컴퓨터는 랜덤으로 뽑기 
			System.out.print("사용자 = " + user + " , 컴퓨터 = " + computer + ", ");
			
			if(user.equals(computer)) {		// 같으면 비긴다 
				System.out.println("비겼습니다.");
			}
			else {
				String winner; 
				switch(user){	// 유저를 기준으로 
					case "가위":
						winner = computer.equals("바위") ? "컴퓨터" : "사용자";		// 유저 가위 -> 컴퓨터 바위 -> 컴퓨터, 아니면 유저 
					case "바위":
						winner = computer.equals("보") ? "컴퓨터" : "사용자";		// 유저 바위 -> 컴퓨터 보 -> 컴퓨터, 아니면 유저 
					case "보":
						winner = computer.equals("가위") ? "컴퓨터" : "사용자";		// 유저 보 -> 컴퓨터 가위 -> 컴퓨터, 아니면 유저 
				System.out.println(winner + "가 이겼습니다.");
				}
			}
			
		}
	}
}
