import java.util.Scanner;

class Dictionary {
	private static String[] kor = { "사랑", "아기", "돈", "미래", "희망" };
	private static String[] eng = { "love", "baby", "money", "future", "hope" };
	
	public static String kor2Eng(String word) {
		for(int i=0; i<kor.length; i++) {
			if(kor[i].equals(word))
				return eng[i];
		}
		return "0";
	}
}

public class DicApp {
	private Scanner scanner;
	public DicApp() {
		scanner = new Scanner(System.in);
		System.out.println("한영 단어 검색 프로그램입니다.");
	}
	
	public void run() {
		String myWord = "";
		while(true) {
			System.out.print("한글 단어?");
			myWord = scanner.next();
			
			if(myWord.equals("그만"))
				break;
			
			if(Dictionary.kor2Eng(myWord) != "0") 
				System.out.println(myWord +"은 " + Dictionary.kor2Eng(myWord));
			else System.out.println(myWord+"는 저의 사전에 없습니다.");
		}
	}
	public static void main(String[] args) {
		DicApp dic = new DicApp();
		dic.run();
	}
}
