package decorator_pattern.implementations;

import decorator_pattern.abstracts.Beverage;

public class Espresso extends Beverage{

	@Override
	public int Cost() {
		return 1;
	}

}
