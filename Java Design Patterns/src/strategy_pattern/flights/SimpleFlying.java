package strategy_pattern.flights;

import strategy_pattern.interfaces.IFlying;

public class SimpleFlying implements IFlying{

	@Override
	public void fly() {
		System.out.println("flaps");
	}

}
