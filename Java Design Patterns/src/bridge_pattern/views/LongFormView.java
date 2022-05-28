package bridge_pattern.views;

import bridge_pattern.abstractions.IResource;
import bridge_pattern.abstractions.View;

public class LongFormView extends View{
	
	public LongFormView(IResource r) {
		super(r);
		// TODO Auto-generated constructor stub
		resource = r;
	}

	IResource resource;

	@Override
	public String Show() {
		return this.resource.Snippet() + " " + this.resource.Title() + " at " + this.resource.Url() + " name: " + this.resource.Image();
	}
}
