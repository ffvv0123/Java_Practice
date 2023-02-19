import java.util.Scanner;

class Player {
	String name;
	static String word;
	long delayTime;

	public Player(String name) {
		this.name = name;
		this.delayTime = 0;
	}

	public void getWordFromUser() {
		// 문제에서는 구현하라고 하지만, static 변수로 word를 만들면 구현하지 않아도 된다.
	}

	public boolean checkSuccess(char lastChar, char firstChar) {
		if (lastChar == firstChar)
			return true;
		else
			return false;
	}

	public void sumDelayTime(long time) {
		this.delayTime += time;
	}
}

public class WordGameApp {
	private void run() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("끝말잇기 게임을 시작합니다...");
		System.out.print("게임에 참가하는 인원은 몇명입니까>>");
		int n = scanner.nextInt();

		Player[] player = new Player[n];
		for (int i = 0; i < n; i++) {
			System.out.print("참가자의 이름을 입력하세요>>");
			player[i] = new Player(scanner.next());
		}

		Player.word = "아버지";
		System.out.println("시작하는 단어는 " + Player.word + "입니다.");

		int cnt = 0;
		while (true) {
			int lastIndex = Player.word.length() - 1;
			char lastChar = Player.word.charAt(lastIndex);

			// 플레이어의 단어 입력과 지연시간 갱신
			System.out.print(player[cnt].name + ">>");
			long startTime = System.currentTimeMillis();
			Player.word = scanner.next();
			long endTime = System.currentTimeMillis();
			player[cnt].sumDelayTime(endTime - startTime);
			char firstChar = Player.word.charAt(0);

			if (!player[cnt].checkSuccess(lastChar, firstChar)) {
				System.out.println(player[cnt].name + "이 졌습니다.");
				System.out.println("게임 시간");
				for (int i = 0; i < n; i++)
					System.out.println(player[i].name + "의 플레이 시간: " + player[i].delayTime / 1000.0 + "s");
				break;
			}
			cnt = ++cnt % n;
		}
		scanner.close();
	}

	public static void main(String[] args) {
		WordGameApp play = new WordGameApp();
		play.run();
	}
}
