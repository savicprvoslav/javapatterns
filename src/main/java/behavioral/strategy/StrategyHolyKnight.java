package behavioral.strategy;

import model.HolyKnight;

public class StrategyHolyKnight extends HolyKnight implements StrategyKnight {

    private Strategy strategy = null;

    public void setStrategy(Strategy strategy) {
	this.strategy = strategy;
    }

    @Override
    public void reduceArmor(Double reduceValue) {
	super.reduceArmor(reduceValue);
	if (strategy != null) {
	    strategy.armorResponse(getArmor());
	}
    }
}
