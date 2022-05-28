package bridge_pattern.resources;

import bridge_pattern.abstractions.IResource;
import bridge_pattern.artists.Artist;

public class ArtistResource implements IResource{
	Artist who;
	
	public ArtistResource(Artist toto) {
		this.who = toto;
	}
	
	@Override
	public String Image() {
		return who.getArtistName();
	}
	@Override
	public String Snippet() {
		return "snip snip";
	}
	
	@Override
	public String Title() {
		return who.getBestSong();
	}
	
	@Override
	public String Url() {
		return "youtube link";
	}	

}
