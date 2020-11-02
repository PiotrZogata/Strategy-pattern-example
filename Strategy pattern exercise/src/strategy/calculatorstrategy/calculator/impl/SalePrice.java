package strategy.calculatorstrategy.calculator.impl;

public class SalePrice implements PricingStrategy {

	@Override
	public void calculatePrice(double price, boolean isSignedUpForNewsletter) {


		  if(isSignedUpForNewsletter == true) {
		    	 System.out.println("Przecena "+price/2+"z³");
		     } else
System.out.println("U¿ytkownik nie jest zapisany do newslettera, nale¿y wybraæ inn¹ strategiê cenow¹!");
	}

}
