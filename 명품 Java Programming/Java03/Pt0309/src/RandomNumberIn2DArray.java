import java.lang.Math;

public class RandomNumberIn2DArray {
	public static void main(String[] args) {
		int arr[][] = new int[4][4];

		for (int i = 0; i < 4; i++)
			for (int j = 0; j < 4; j++)
				arr[i][j] = (int) (Math.random() * 10 + 1);
		
		for(int[] i : arr) {	// 2차원 배열의 행을 받는다.
			for(int j : i)		// 2차원 배열의 열을 받는다.
				System.out.print(j + " ");
			System.out.println();
		}		
	}
}
