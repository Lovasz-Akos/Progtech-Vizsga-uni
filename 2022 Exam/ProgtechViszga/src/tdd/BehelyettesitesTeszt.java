package tdd;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BehelyettesitesTeszt {


	
	@Test
	void testReplaceAllAsWithEs() throws MyNullParamException, MyNegativeParamExeption {
		String result;
		String bemenet = "alma";
		char keresettKarakter = 'a';
		char helyettesitoKarakter = 'e';
		int cserelendoElemek = 1;
		
		
		Behelyettes�t�s behelyettesites = new Behelyettes�t�s();
		result = behelyettesites.behelyettesit(bemenet, keresettKarakter, helyettesitoKarakter, cserelendoElemek);
		assertEquals("elme", result);
			
		bemenet = "almaaaaaaaaaaaaaaa";
		result = behelyettesites.behelyettesit(bemenet, keresettKarakter, helyettesitoKarakter, cserelendoElemek);
		assertEquals("elmeeeeeeeeeeeeeee", result);
	}
	
	@Test
	void testReplaceEveryThirdAwithK() throws MyNullParamException, MyNegativeParamExeption{
		String result;
		String bemenet = "almaaaaaaaaaaaaa";
		char keresettKarakter = 'a';
		char helyettesitoKarakter = 'k';
		int cserelendoElemek = 3;
		
		Behelyettes�t�s behelyettesites = new Behelyettes�t�s();
		result = behelyettesites.behelyettesit(bemenet, keresettKarakter, helyettesitoKarakter, cserelendoElemek);
		
		assertEquals("almakaakaakaakaa", result);
	}
	
	@Test
	void testNoCharsReplaced() throws MyNullParamException, MyNegativeParamExeption {
		String result;
		String bemenet = "alma";
		char keresettKarakter = 'a';
		char helyettesitoKarakter = 'k';
		int cserelendoElemek = 0;
		
		Behelyettes�t�s behelyettesites = new Behelyettes�t�s();
		result = behelyettesites.behelyettesit(bemenet, keresettKarakter, helyettesitoKarakter, cserelendoElemek);
		assertEquals("alma", result);
	}
	
	@Test
	void testThrowsMyNullParamException() throws MyNullParamException, MyNegativeParamExeption{
		String bemenet = null;
		char keresettKarakter = 'a';
		char helyettesitoKarakter = 'k';
		int cserelendoElemek = 0;

		Behelyettes�t�s behelyettesites = new Behelyettes�t�s(); 
		assertEquals(MyNullParamException.class, behelyettesites.behelyettesit(bemenet, keresettKarakter, helyettesitoKarakter, cserelendoElemek));
		}
	
	@Test
	void testNegativeException() {
		String bemenet = null;
		char keresettKarakter = 'a';
		char helyettesitoKarakter = 'k';
		int cserelendoElemek = 0;

		Behelyettes�t�s behelyettesites = new Behelyettes�t�s(); 
		assertThrows(MyNegativeParamExeption.class, behelyettesites.behelyettesit(bemenet, keresettKarakter, helyettesitoKarakter, cserelendoElemek));
	}
	
}