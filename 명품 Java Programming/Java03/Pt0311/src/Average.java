
public class Average {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=0; i<args.length; i++)
			sum += Integer.parseInt(args[i]);
		System.out.println(sum / args.length);
	}
}


/* // Open Terminal
* input: cd /Users/jjos/Cons/Java/명품\ Java\ Programming/Java03/Pt0311/src	// 파일 경로
* input: javac Average.java		// 컴파일 	
* input: java Average 2 3 4	// 실행 
* Output: 3
*/