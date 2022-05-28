package strategy_pattern;

import strategy_pattern.displays.DisplayAsGraphics;
import strategy_pattern.displays.DisplayAsText;
import strategy_pattern.ducks.Duck;
import strategy_pattern.flights.FastFlying;
import strategy_pattern.flights.SimpleFlying;
import strategy_pattern.interfaces.IDisplaying;
import strategy_pattern.interfaces.IFlying;
import strategy_pattern.interfaces.IQuacking;
import strategy_pattern.quacks.NoQuack;
import strategy_pattern.quacks.SimpleQuacking;

public class StrategyStarter {

	public static void main(String[] args) {
		IFlying flyfast = new FastFlying();
		IQuacking quacknot = new NoQuack();
		IDisplaying displaytext = new DisplayAsText();
		
		IFlying fly = new SimpleFlying();
		IQuacking quac = new SimpleQuacking();
		IDisplaying displaygraphics = new DisplayAsGraphics();
		
		Duck duck1 = new Duck(flyfast, quacknot, displaytext);
		duck1.fly();
		duck1.quack();
		duck1.display();
		
		Duck duck2 = new Duck(fly, quac, displaygraphics);
		duck2.fly();
		duck2.quack();
		duck2.display();
	}

}