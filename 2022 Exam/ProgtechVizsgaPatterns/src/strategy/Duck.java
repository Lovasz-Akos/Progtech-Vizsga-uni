package strategy;

public class Duck {
	IQuack quack;
	IFly fly;
	
	public Duck(IFly fly, IQuack quack) {
		this.fly = fly;
		this.quack = quack;
	}
	
	public void fly() {
		this.fly.fly();
	}
	
	public void quack() {
		this.quack.quack();
	}
}
