package strategy_pattern.flights;

import strategy_pattern.interfaces.IFlying;

public class FastFlying implements IFlying{

	@Override
	public void fly() {
		System.out.println("zoom");
	}
}
