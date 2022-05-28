package adapter_pattern;

import adapter_pattern.adapters.Adaptee;
import adapter_pattern.adapters.Adapter;
import adapter_pattern.interfaces.ITarget;

public class AdapterStarter {

	public static void main(String[] args) {
		
		ITarget target = new Adapter(new Adaptee());
		
		target.Request();
	}
}
