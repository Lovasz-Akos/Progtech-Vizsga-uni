package decorator_pattern;

import decorator_pattern.concreteDecorators.Caramel;
import decorator_pattern.concreteDecorators.Milk;
import decorator_pattern.implementations.Espresso;

public class DecoratorStarter {

	public static void main(String[] args) {
		
		Caramel kofi = new Caramel(new Milk(new Espresso()));
		
		System.out.println(Integer.toString(kofi.Cost()));

	}
}
