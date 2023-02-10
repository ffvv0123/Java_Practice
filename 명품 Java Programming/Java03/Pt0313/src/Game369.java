
public class Game369 {
	public static void main(String[] args) {
		for (int i = 1; i <= 99; i++) {
			int digitOne = i % 10;
			int digitTen = i / 10;

			if (i < 10) {
				if (digitOne % 3 == 0)
					System.out.println(i + " 박수 짝");
			} else {
				if (digitOne != 0 && digitOne % 3 == 0 ^ digitTen % 3 == 0)
					System.out.println(i + " 박수 짝");
				else if (digitOne != 0 && digitOne % 3 == 0 && digitTen % 3 == 0)
					System.out.println(i + " 박수 짝짝");
			}
		}
	}
}
