package bridge_pattern.artists;

public class Artist {
	String name;
	String bestSong;
	
	public Artist(String name, String hisBestSong) {
		this.name = name;
		this.bestSong = hisBestSong;
		
	}
	
	public String getArtistName() {
		return this.name;
	}
	public String getBestSong() {
		return this.bestSong;
	}

}
