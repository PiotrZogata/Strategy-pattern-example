package strategy;

import strategy.calculator.PriceCalculator;
import strategy.calculatorstrategy.calculator.impl.RegularPrice;
import strategy.calculatorstrategy.calculator.impl.SalePrice;

public class Main {

	public static void main(String[] args) {
		
		PriceCalculator priceCalculator = new PriceCalculator();
		 //U¿ytkownik nie jest zapisany do newslettera - normalna cena
		
		 priceCalculator.setPrincingStrategy(new RegularPrice());
		 priceCalculator.calculate(100, false);
		 
		 //U¿ytkownik jest zapisany do newslettera - wybrana b³êdna strategia
		 priceCalculator.setPrincingStrategy(new RegularPrice());
		 priceCalculator.calculate(100, true);
		 
		 //U¿ytkownik jest zapisany do newslettera
		 priceCalculator.setPrincingStrategy(new SalePrice());
		 priceCalculator.calculate(100, true);
		 
		 //U¿ytkownik jest zapisany do newslettera - wybrana b³êdna strategia
		 priceCalculator.setPrincingStrategy(new SalePrice());
		 priceCalculator.calculate(100, false);

	}

}
