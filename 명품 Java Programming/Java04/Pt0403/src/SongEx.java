class Song {
	private String title;
	private String artist;
	private String country;
	private int year;

	Song() {
		this("", "", "", 0);
	}

	Song(String title, String artist, String country, int year) {
		this.title = title;
		this.artist = artist;
		this.country = country;
		this.year = year;
	}

	void show() {
		System.out.printf("%d년 %s국적의 %s가 부른 %s\n", this.year, this.country, this.artist, this.title);
	}

}

public class SongEx {
	public static void main(String[] args) {
		Song mySong = new Song("Dancing Queen", "ABBA", "스웨덴", 1978);
		mySong.show();
	}
}
