package proxy_pattern.cocrete;

import proxy_pattern.interfaces.ISubject;

public class RealSubject implements ISubject{
	
	public RealSubject(String Thing) {
		//do stuff
	}

	@Override
	public void request() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public int getNumber() {
		return 5;
	}

}
