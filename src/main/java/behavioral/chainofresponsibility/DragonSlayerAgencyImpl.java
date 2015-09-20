package behavioral.chainofresponsibility;

import model.Knight;

/**
 * Dragon slayer agency with one knight that anyone can rent to slay a dragon
 * 
 * @author prvoslav
 * Chain of responsibility
 */
public class DragonSlayerAgencyImpl implements DragonSlayerHandler {

    private Knight knight = null;
    private DragonSlayerHandler nextAgency = null;

    public DragonSlayerAgencyImpl(DragonSlayerHandler nextAgency, Knight knight) {
	this.knight = knight;
	this.nextAgency = nextAgency;
    }

    public Knight getKnight() {
	return knight;
    }

    public Integer getDamage() {
	return knight.getDamage();
    }

    public Boolean attack(Integer minDamage) {

	if (getKnight().getDamage() > minDamage) {
	    return true;
	} else {
	    System.out.println("To strong for me " + getKnight().getDamage() + " > " + minDamage);

	    if (nextAgency != null) {
		return nextAgency.attack(minDamage);
	    } else {
		throw new RuntimeException("To strong for us");
	    }
	}

    }

}
