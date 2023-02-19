import java.util.Scanner;

class Day {
	private String work;

	public void set(String work) {
		this.work = work;
	}

	public String get() {
		return this.work;
	}

	public void show() {
		if (work == null)
			System.out.println("없습니다.");
		else
			System.out.println(work + "입니다.");
	}
}

public class MonthSchedule {
	private int day; // 일
	private Scanner scanner;

	MonthSchedule(int day) {
		System.out.println("이번달 관리 프로그램.");
		scanner = new Scanner(System.in);
		this.day = day;
	}

	private void input(Day d) {
		System.out.print("할일(빈칸없이입력)?");
		String works = scanner.next();
		d.set(works);
	}

	private void view(Day d) {
		System.out.print(this.day + "일의 할 일은 ");
		d.show();
	}

	private boolean finish() {
		System.out.println("프로그램을 종료합니다.");
		return false;
	}

	void run() {
		Day date[] = new Day[day];
		for (int i = 0; i < date.length; i++) {
			date[i] = new Day();
		}

		int option;
		boolean execute = true;
		while (execute) {
			System.out.print("할일(입력: 1, 보기:2, 끝내기:3) >>");
			option = scanner.nextInt();
			if (option == 3) {
				execute = finish();
				break;
			}
			System.out.printf("날짜(1~%d)?", this.day);
			int days = scanner.nextInt();

			switch (option) {
			case 1:
				input(date[days]);
				break;
			case 2:
				view(date[days]);
				break;
			}
		}
	}

	public static void main(String[] args) {
		MonthSchedule april = new MonthSchedule(30);
		april.run();
	}
}
