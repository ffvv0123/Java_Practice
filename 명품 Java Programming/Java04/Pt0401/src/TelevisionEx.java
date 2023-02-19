class TV {
	private String name;
	private int year;
	private int inch;

	TV(String name, int year, int inch) {
		this.name = name;
		this.year = year;
		this.inch = inch;
	}

	void show() {
		System.out.println(name + "에서 만든 " + year + "년형 " + inch + "인치 TV");
	}
}

public class TelevisionEx {
	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
	}
}
