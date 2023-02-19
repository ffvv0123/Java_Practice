import java.util.Scanner;

class Seat {
	private String reserveName;

	Seat(String name) {
		this.reserveName = name;
	}

	static void Show(Seat s[][]) {
		System.out.print("S>> ");
		for (int i = 0; i < s[0].length; i++)
			System.out.print(s[0][i].reserveName + " ");
		System.out.println();

		System.out.print("A>> ");
		for (int i = 0; i < s[1].length; i++)
			System.out.print(s[1][i].reserveName + " ");
		System.out.println();

		System.out.print("B>> ");
		for (int i = 0; i < s[2].length; i++)
			System.out.print(s[2][i].reserveName + " ");
		System.out.println();
	}

	static void Show(Seat s[][], int seatClass) {

		if (seatClass == 1) {
			System.out.print("S>> ");
			for (int i = 0; i < s[0].length; i++)
				System.out.print(s[0][i].reserveName + " ");
			System.out.println();
		} else if (seatClass == 2) {
			System.out.print("A>> ");
			for (int i = 0; i < s[1].length; i++)
				System.out.print(s[1][i].reserveName + " ");
			System.out.println();
		} else {
			System.out.print("B>> ");
			for (int i = 0; i < s[2].length; i++)
				System.out.print(s[2][i].reserveName + " ");
			System.out.println();
		}
	}

	public void setSeatName(String reserveName) {
		this.reserveName = reserveName;
	}
	
	public String getSeatName() {
		return this.reserveName;
	}
	
	static boolean cancleSeat(Seat s[][], String cancleName, int seatClass) {
		for(int i=0; i<s[seatClass-1].length; i++) {
			if(s[seatClass-1][i].reserveName.equals(cancleName)) {
				s[seatClass-1][i].setSeatName("---");
				return true;
			}
		}
		return false;
	}
}

public class ReservationEx {
	private Scanner scanner;

	ReservationEx() {
		scanner = new Scanner(System.in);
		System.out.println("명품콘서트홀 예약 시스템입니다.");
	}

	public void run() {
		Seat s[][] = new Seat[3][10];

		for (int i = 0; i < 10; i++) {
			s[0][i] = new Seat("---"); // S
			s[1][i] = new Seat("---"); // A
			s[2][i] = new Seat("---"); // B
		}
		int selectMenu = -1;
		while (true) {
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
			selectMenu = scanner.nextInt();
			if (selectMenu == 4)
				break;

			switch (selectMenu) {
			case 1:
				System.out.print("좌석구분 S(1), A(2), B(3)>>");
				
				int seatClass;
				while(true) { // 예외처리[1,2,3이 아닌 다른 입력이 들어온 경우]
					seatClass= scanner.nextInt();
					if(seatClass == 1 || seatClass == 2 || seatClass == 3)
						break;
					else {
						System.out.println("잘못된 입력입니다.");
						System.out.print("좌석구분 S(1), A(2), B(3)>>");
					}
				}
				Seat.Show(s, seatClass);
				System.out.print("이름>>");
				String reserveName = scanner.next();
				System.out.print("번호>>");
				
				int reserveSeatNumber;
				while(true) { // 예약된 자리 예외처리
					reserveSeatNumber= scanner.nextInt();
					if(reserveSeatNumber > 0 && reserveSeatNumber < 11 && s[seatClass-1][reserveSeatNumber-1].getSeatName().equals("---"))
						break;
					else {
						System.out.println("잘못된 입력입니다.");
					}
						
				}
				s[seatClass - 1][reserveSeatNumber - 1].setSeatName(reserveName);
				break;
				
			case 2:
				Seat.Show(s);
				System.out.println("<<<조회를 완료하였습니다.>>>");
				break;
				
			case 3:
				
				System.out.print("좌석구분 S:1, A:2, B:3>>");
				while(true) { // 예외처리[1,2,3이 아닌 다른 입력이 들어온 경우]
					seatClass= scanner.nextInt();
					if(seatClass == 1 || seatClass == 2 || seatClass == 3)
						break;
					else {
						System.out.println("잘못된 입력입니다.");
						System.out.print("좌석구분 S(1), A(2), B(3)>>");
					}
				}
				Seat.Show(s, seatClass);
				while(true) {
					System.out.print("이름>>");
					String cancleName = scanner.next(); // 없는 이름 예외처리
					if(Seat.cancleSeat(s, cancleName, seatClass))
						break;
					else {
						System.out.println("잘못된 입력입니다. 입력할 수 없으면 ---를 입력하세요.");
					}
				}
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}

	}

	public static void main(String[] args) {
		ReservationEx me = new ReservationEx();
		me.run();
	}
}
