package strategy_pattern.quacks;

import strategy_pattern.interfaces.IQuacking;

public class NoQuack implements IQuacking{
	
	@Override
	public void quack() {
		System.out.println("*silence*");
	}
}
