import java.util.Scanner;
public class Operation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("연산>> ");
		double val1 = scanner.nextDouble();
		String operator = scanner.next();
		double val2 = scanner.nextDouble();
		
		double result = 0;
		boolean inf = false;
		
		// if-else Statement
		/*
		if(operator.equals("+"))
			result = val1 + val2;
		else if(operator.equals("-"))
			result = val1 - val2;
		else if(operator.equals("*"))
			result = val1 * val2;
		else if(operator.equals("/") && val2 != 0)
			result = val1 / val2;
		
		if(operator.equals("/") && val2 == 0)
			inf = true;
		
		if(!inf)
			System.out.println(val1 + operator + val2 + "의 계산 결과는 " + result);
		else
			System.out.println("0으로 나눌 수 없습니다.");
		*/
		
		// switch Statement
		switch (operator) {
		case "+":
			result = val1 + val2;
			break;
		case "-":
			result = val1 - val2;
			break;
		case "*":
			result = val1 * val2;
			break;
		case "/":
			if (val2 == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
				inf = true;
				break;
			}
			result = val1 / val2;
			break;
		}
		
		if(!inf && !operator.equals("/"))
			System.out.println((int)val1 + operator + (int)val2 + "의 계산 결과는 " + (int)result);
		else
			System.out.println((int)val1 + operator + (int)val2 + "의 계산 결과는 " + result);
		
		scanner.close();
	}
}
