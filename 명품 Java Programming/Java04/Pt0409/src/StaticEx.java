class ArrayUtil {
	public static int[] concat(int[] a, int[] b) {
		int length = a.length + b.length;
		int[] array = new int[length];

		for (int i = 0; i < a.length; i++)
			array[i] = a[i];
		for (int i = a.length; i < length; i++)
			array[i] = b[i - a.length];

		return array;
	}

	public static void print(int[] c) {
		System.out.print("[ ");
		for (int i : c)
			System.out.print(i + " ");
		System.out.println("]");

	}
}

public class StaticEx {
	public static void main(String[] args) {
		int[] array1 = { 1, 5, 7, 9 };
		int[] array2 = { 3, 6, -1, 100, 77 };
		int[] array3 = ArrayUtil.concat(array1, array2);
		ArrayUtil.print(array3);

	}
}
