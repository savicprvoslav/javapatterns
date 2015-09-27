package structural.composit;

import java.util.ArrayList;
import java.util.List;

import model.Knight;
import model.KnightWeapon;

public class KnightArmy implements Knight, Cloneable {

    private List<Knight> knights = new ArrayList<Knight>();
    private String armyName = null;

    public void addKnight(Knight knight) {
	knights.add(knight);
    }

    public String getName() {
	return armyName;
    }

    public void setName(String name) {
	this.armyName = name;
    }

    public void setWeapon(KnightWeapon knightWeapon) {
	for (Knight knight : knights) {
	    knight.setWeapon(knightWeapon);
	}
    }

    public Knight cloneKnight() throws CloneNotSupportedException {

	return (Knight) this.clone();
    }

    public Integer getDamage() {
	Integer totalDamage = 0;
	for (Knight knight : knights) {
	    totalDamage += knight.getDamage();
	}

	return totalDamage;
    }

    public void readQuest(String questDetails) {

    }

    public Double getArmor() {
	Double armorTotal = 0d;
	for (Knight knight : knights) {
	    armorTotal += knight.getArmor();
	}
	return armorTotal;
    }

    public void reduceArmor(Double reduceValue) {
	Double perKnight = reduceValue / knights.size();
	for (Knight knight : knights) {
	    knight.reduceArmor(perKnight);
	}
    }

    public KnightWeapon getWeapon() {
	return null;
    }
}
