package strategy_pattern.ducks;

import strategy_pattern.interfaces.IDisplaying;
import strategy_pattern.interfaces.IFlying;
import strategy_pattern.interfaces.IQuacking;

public class Duck {
	IFlying fly;
	IQuacking quack;
	IDisplaying display;
	
	public Duck(IFlying fly, IQuacking quack, IDisplaying display) {
		this.fly = fly;
		this.quack = quack;
		this.display = display;
	}
	
	public void fly() {
		this.fly.fly();
	}
	
	public void quack() {
		this.quack.quack();
	}
	
	public void display() {
		this.display.display();
	}
}
