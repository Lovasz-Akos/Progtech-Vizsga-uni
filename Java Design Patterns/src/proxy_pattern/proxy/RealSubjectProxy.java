package proxy_pattern.proxy;

import proxy_pattern.cocrete.RealSubject;
import proxy_pattern.interfaces.ISubject;

public class RealSubjectProxy implements ISubject {
	private RealSubject rs;
	private String thing;
	
	public RealSubjectProxy(String xd) {
		this.thing = xd;
	}

	@Override
	public void request() {
		this.rs.request();
	}
	
	@Override
	public int getNumber() {
		if(this.rs==null) {
			this.rs=new RealSubject(thing);
		}
		
		return this.rs.getNumber();
	}

}
