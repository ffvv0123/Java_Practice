
public class Calc {
	public static void main(String[] args) {
		double sum = 0.0;
		
		for(int i=0; i<args.length; i++)		// 인자 개수만큼 반복
			sum += Double.parseDouble(args[i]);	// 문자열을 double로 변환하여 합산
		
		System.out.println("sum = " + sum);
	}
}


/* // Open Terminal
* input: cd /Users/jjos/Cons/Java/명품\ Java\ Programming/Java03/Ex0313/src	// 파일 경로
* input: javac Calc.java		// 컴파일 	
* input: java Calc 2 20.5 88.1	// 실행 
* Output: sum = 110.6
*/