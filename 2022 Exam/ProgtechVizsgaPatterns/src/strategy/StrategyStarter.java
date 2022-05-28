package strategy;

public class StrategyStarter {

	public static void main(String[] args) {
		IFly flyFast = new FastFlying();
		IQuack quackQuiet = new QuietQuack();
		IQuack quackLoud = new LoudQuack();
		
		System.out.println("duck1: ");
		Duck duck1 = new Duck(flyFast, quackQuiet);
		duck1.fly();
		duck1.quack();
		System.out.println("\n");
		System.out.println("duck2: ");
		Duck duck2 = new Duck(flyFast, quackLoud);
		duck2.fly();
		duck2.quack();
		
	}

}
