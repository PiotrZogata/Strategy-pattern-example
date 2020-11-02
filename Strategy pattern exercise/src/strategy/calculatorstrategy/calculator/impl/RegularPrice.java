package strategy.calculatorstrategy.calculator.impl;

public class RegularPrice implements PricingStrategy{
	
	@Override
	public void calculatePrice(double price, boolean isSignedUpForNewsletter) {

     if(isSignedUpForNewsletter == false) {
    	 System.out.println("Normalna cena: "+price+"z�");
     } else
     System.out.println("U�ytkownik zapisany do newslettera, nale�y wybra� inn� strategi� cenow�!");
	}

}
