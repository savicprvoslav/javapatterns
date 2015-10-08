package behavioral.chainofresponsibility;

import model.Knight;

/**
 * Dragon slayer agency with one knight that anyone can rent to slay a dragon,
 * in case that dragon is to strong it asks next rep to help out. Finding the
 * right knight is the ultimate goal
 * 
 * @author prvoslav
 * 
 *         Chain of responsibility
 */
public class DragonSlayerRepresentitive extends AbstractDragonSlayerRepresentative {

    private Knight knight = null;

    public DragonSlayerRepresentitive(DragonSlayer nextRep, Knight knight) {
	super(nextRep);
	this.knight = knight;
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
	    return super.attack(minDamage);
	}
    }
}
