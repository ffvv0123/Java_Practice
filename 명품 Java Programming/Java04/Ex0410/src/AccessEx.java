class Sample{
	public int a;
	private int b;
	int c;	// default access specifier
}

public class AccessEx {
	public static void main(String[] args) {
		Sample sample = new Sample();
		sample.a = 10;
		//sample.b = 10;
		sample.c = 10;
	}
}

/*
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	The field Sample.b is not visible at AccessEx.main(AccessEx.java:10)
	-> b of the sample class is specified "private". So b can only be used in Sample class. 

*/