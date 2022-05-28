package decorator_pattern.concreteDecorators;

import decorator_pattern.abstracts.AddonDecorator;
import decorator_pattern.abstracts.Beverage;

public class Caramel extends AddonDecorator{

	Beverage beverage;
	
	public Caramel(Beverage b) {
		this.beverage = b;
	}
	
	@Override
	public int Cost() {
		return this.beverage.Cost()+2;
	}
}
