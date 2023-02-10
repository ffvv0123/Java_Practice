import java.lang.Math;

public class RandomNumber10OrZero {
	public static void main(String[] args) {
		int arr[][] = new int[4][4];
		boolean isUnique[] = new boolean[16];

		int cnt = 0;
		while(true) {	// 0부터 15까지 임의의 정수 10개를 중복없이 배열에 저장 -> boolean 방식
			int tmp = (int) (Math.random() * 16);
			if(isUnique[tmp] == false) {
				isUnique[tmp] = true;
				cnt++;
			}
			
			if (cnt == 10)
				break;
		}

		for (int i = 0; i < 4; i++)		// 선택된 10개의 수에 해당하는 index의 데이터에 랜덤 값 입력
			for (int j = 0; j < 4; j++) {
				if (isUnique[4 * i + j] == true)
					arr[i][j] = (int) (Math.random() * 10 + 1);
			}

		for (int[] i : arr) { // 2차원 배열의 행을 받는다.
			for (int j : i) // 2차원 배열의 열을 받는다.
				System.out.print(j + "\t");
			System.out.println();
		}
	}
}
