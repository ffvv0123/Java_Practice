/*
 * Title: 가위바위보.java
 * Author: Suhyeon Jo
 * Date: 2023-02-05
 * Open Challenge 2
 */
import java.util.Scanner;
public class 가위바위보 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
		
		System.out.print("철수 >> ");
		String 철수 = scanner.next();
		
		System.out.print("영희 >> ");
		String 영희 = scanner.next();
		
		
		if(철수.equals(영희))
			System.out.println("비겼습니다.");
		else {
			String winner; 
			switch(철수){
				case "가위":
					winner = 영희.equals("바위") ? "영희" : "철수";
				case "바위":
					winner = 영희.equals("보") ? "영희" : "철수";
				case "보":
					winner = 영희.equals("가위") ? "영희" : "철수";
			System.out.println(winner + "가 이겼습니다.");
			}
		}
	}
}
