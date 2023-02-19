
public class GarbageEx {
	public static void main(String[] args) {
		String a = new String("Good");
		String b = new String("Bad");
		String c = new String("Normal");
		String d, e;
		a = null;
		d = c;
		c = null;
	}
}


/*
*	// Before
*	a -> "Good"
*	b -> "Bad"
*	c -> "normal"
*	d
*	e
*
*	// After
*	a   "Good" <- garbage
*	b -> "Bad"
*	c
*	d -> "normal"
*	e
*
*
*
*/