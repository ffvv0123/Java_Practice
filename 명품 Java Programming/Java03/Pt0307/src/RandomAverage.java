import java.lang.Math;

public class RandomAverage {
	public static void main(String[] args) {
		int rand[] = new int[10];
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			rand[i] = (int) (Math.random() * 10 + 1);
			sum += rand[i];
		}
		
		System.out.print("랜덤한 정수들 : ");
		for (int i : rand)
			System.out.print(i + " ");
		System.out.println();
		
		System.out.println("평균은 " + (double)sum / 10);
	}
}
