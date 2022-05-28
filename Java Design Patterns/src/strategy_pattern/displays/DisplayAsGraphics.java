package strategy_pattern.displays;

import strategy_pattern.interfaces.IDisplaying;

public class DisplayAsGraphics implements IDisplaying{
	
	@Override
	public void display() {
		System.out.println(":v");
		
	}

}
