package tdd;

public class Behelyettesítés {
	public String behelyettesit(String bemenet, char keresettElem, char csereKarakter, int csereSzam) 
			throws MyNullParamException, MyNegativeParamExeption{
		String result = "";
		
		if (csereSzam == 0) {
			return bemenet;
		}
		
		if (bemenet.equals(null)) {
			throw new MyNullParamException(result);
		}
		if (csereSzam < 0) {
			throw new MyNegativeParamExeption(result);
		}
		
		for (int i = 0; i < bemenet.length(); i++) {
			if ((bemenet.charAt(i) == keresettElem) && (i % csereSzam == 0)) {
				result += csereKarakter;
			}
			else {
				result += bemenet.charAt(i);
			}
		}
		return result;
	}
}
