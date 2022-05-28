package bridge_pattern.abstractions;


public abstract class View {
	IResource resource;
	
	public View(IResource r) {
		this.resource = r;
	}
	
	
	public abstract String Show();

}
