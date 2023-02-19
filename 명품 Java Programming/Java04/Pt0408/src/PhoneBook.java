import java.util.Scanner;

class Phone {
	private String name;
	private String tel;

	Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}

	public String getName() {
		return this.name;
	}

	public String getTel() {
		return this.tel;
	}
}

public class PhoneBook {
	private Scanner scanner;

	PhoneBook() {
		scanner = new Scanner(System.in);
	}

	void searchPerson(Phone[] p, String search) {
		for (int i = 0; i < p.length; i++) {
			if (search.equals(p[i].getName())) {
				System.out.println(search + "의 전화번호는 " + p[i].getTel() + "입니다.");
				return;
			}
		}
		System.out.println(search + " 이 없습니다.");
	}

	void run() {
		System.out.print("인원수>>");
		int numPerson = scanner.nextInt();
		Phone p[] = new Phone[numPerson];
		for (int i = 0; i < p.length; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력) >>");
			String inputName = scanner.next();
			String inputTel = scanner.next();
			p[i] = new Phone(inputName, inputTel);
		}
		System.out.println("저장되었습니다...");

		String search = "";

		while (true) {
			System.out.print("검색할 이름>>");
			search = scanner.next();
			if (search.equals("그만"))
				break;
			searchPerson(p, search);
		}

	}

	public static void main(String[] args) {
		PhoneBook pb = new PhoneBook();
		pb.run();
	}
}
