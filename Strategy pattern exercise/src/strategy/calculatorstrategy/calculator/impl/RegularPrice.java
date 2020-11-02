package strategy.calculatorstrategy.calculator.impl;

public class RegularPrice implements PricingStrategy{
	
	@Override
	public void calculatePrice(double price, boolean isSignedUpForNewsletter) {

     if(isSignedUpForNewsletter == false) {
    	 System.out.println("Normalna cena: "+price+"z³");
     } else
     System.out.println("U¿ytkownik zapisany do newslettera, nale¿y wybraæ inn¹ strategiê cenow¹!");
	}

}
