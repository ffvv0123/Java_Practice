
public class Add {
	public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 0; i < args.length; i++) {
			try {
				sum += Integer.parseInt(args[i]);	// sum에 다음 args[]를 넣어보자
			}
			catch(NumberFormatException e) {		// ㄲㅂ 안걸리면 다음으로 넘겨
				continue;
			}
		}
		System.out.println(sum);
	}
}


/* // Open Terminal
* input: cd /Users/jjos/Cons/Java/명품\ Java\ Programming/Java03/Pt0312/src	// 파일 경로
* input: javac Add.java		// 컴파일 	
* input: java Add 2 3 aa 5 6.5 // 실행 // Output: 10 
* input: java Add Hell 3 4 4.3 c true // 실행 // Output: 7
*/