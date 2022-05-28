package progTekBeugrik;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;

class AlmaTest {

	Alma apple = new Alma(150);

	@Test
	void testBuyNoApples() {
		assertNotNull(this.apple.BuyApple(0));
	}
	
	@Test
	void testBuyNegativeApples() {
		assertTrue(apple.BuyApple(-5) == 0);
	}
	
	@Test
	void testBuyRandomApples() {
		Random rng = new Random();
		assertNotNull(this.apple.BuyApple(rng.nextInt()));
	}

	@Test
	void testDiscount() {
		assertTrue(this.apple.BuyApple(99) != this.apple.BuyApple(100) - this.apple.getPrice());
	}

}
