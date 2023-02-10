
public class IterSum {
	public static void main(String[] args) {
		
		/* while statement
		int sum = 0, i = 0;
		while (i < 100) {
			sum += i;
			i += 2;
		}
		*/
		
		/* for statement
		int sum = 0;
		for (int i = 0; i < 100; i += 2)
			sum += i;
		*/
		
		// do-while statement
		int sum = 0, i = 0;
		do {
			sum += i;
			i += 2;
		} while (i < 100);
		
		System.out.println(sum);
	}
}
