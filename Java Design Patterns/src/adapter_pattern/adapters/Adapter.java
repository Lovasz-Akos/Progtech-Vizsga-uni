package adapter_pattern.adapters;

import adapter_pattern.interfaces.ITarget;

public class Adapter implements ITarget{
	Adaptee adaptee;
	
	public Adapter(Adaptee a) {
		this.adaptee = a;
	}

	@Override
	public void Request() {
		this.adaptee.SpecificRequest();
	}
	
}
