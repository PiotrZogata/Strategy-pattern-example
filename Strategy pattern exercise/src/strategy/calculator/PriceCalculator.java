package strategy.calculator;

import strategy.calculatorstrategy.calculator.impl.PricingStrategy;

public class PriceCalculator {

	private PricingStrategy princingStrategy;
	
	public void setPrincingStrategy(PricingStrategy princingStrategy) {
		this.princingStrategy = princingStrategy;
	}

	public void calculate(int i, boolean b){
	
		princingStrategy.calculatePrice(i, b);
	}
}
