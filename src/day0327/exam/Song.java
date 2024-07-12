package day0327.exam;

public class Song {
	private String title;
	private int year;
	private String artist;
	private String country;

	public Song() {
	}

	public Song(String title, int year, String artist, String country) {
		this.title = title;
		this.year = year;
		this.artist = artist;
		this.country = country;
	}

	@Override
	public String toString() {
		return country + " " + year + "년 " + artist + " " + "[" + title + "]";
	}
	
	public void show() {
		System.out.println(toString());
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public static void main(String[] args) {
		Song song = new Song("Dancing Queen", 1987, "ABBA", "스웨덴");
		song.show();
	}
}
