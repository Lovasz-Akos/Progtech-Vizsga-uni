package progTekBeugrik;

public class Alma {

	private int price;
	
	public int getPrice() {
		return price;
	}

	public Alma(int price) {
		this.price = price;
	}

	public int BuyApple(int db){
		if (db < 1) {
			return 0;
		}
		else if(db >= 100) {
			return DiscountApple(db);
		}
		return db * price;
	}

	private int DiscountApple(int db) {
		return db * (price / 2);
	}

}
