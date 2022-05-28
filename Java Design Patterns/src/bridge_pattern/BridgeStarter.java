package bridge_pattern;

import bridge_pattern.abstractions.IResource;
import bridge_pattern.artists.Artist;
import bridge_pattern.resources.ArtistResource;
import bridge_pattern.views.LongFormView;

public class BridgeStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Artist toto = new Artist("tote xd", "africaye");
		
		IResource ar = new ArtistResource(toto);
		
		LongFormView lfv = new LongFormView(ar);
		
		System.out.println(lfv.Show());
	}

}
