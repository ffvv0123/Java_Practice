import java.util.Scanner;

public class CourseScore {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String course[] = { "Java", "C++", "HTML5", "컴퓨터구조", "안드로이드" };
		int score[] = {95, 88, 76, 62, 55};
		
		while(true) {
			System.out.print("과목 이름>>");
			String name = scanner.next();
			
			if(name.equals("그만"))
				break;
			
			boolean isExist = false; 
			
			for(int i=0; i<5; i++) {
				if(course[i].equals(name)) {
					System.out.println(course[i] + "의 점수는 " + score[i]);
					isExist = true;
					break;
				}
			}
			
			if(isExist) continue;
			System.out.println("없는 과목입니다.");
		}
		
		scanner.close();
	}
}
