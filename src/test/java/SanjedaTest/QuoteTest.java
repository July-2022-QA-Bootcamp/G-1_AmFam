package SanjedaTest;

import org.testng.annotations.Test;

import base.BaseClass;

public class QuoteTest extends BaseClass{
	
	@Test
	
	public void newQuote() {
		sanjedaPage.quote();
		sanjedaPage.zip("85142");
		sanjedaPage.clickCar();
		sanjedaPage.clickLetsGo();
	}
	

}
