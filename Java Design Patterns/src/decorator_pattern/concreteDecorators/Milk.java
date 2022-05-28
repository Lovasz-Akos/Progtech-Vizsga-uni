package decorator_pattern.concreteDecorators;

import decorator_pattern.abstracts.AddonDecorator;
import decorator_pattern.abstracts.Beverage;

public class Milk extends AddonDecorator{
	
	Beverage beverage;
	
	public Milk(Beverage b) {
		this.beverage = b;
	}
	
	@Override
	public int Cost() {
		return this.beverage.Cost() + 1;
	}

}
