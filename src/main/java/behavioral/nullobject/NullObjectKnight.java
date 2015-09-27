package behavioral.nullobject;

import model.Knight;
import model.KnightWeapon;

/**
 * 
 * @author prvoslav
 *
 */
public class NullObjectKnight implements Knight {

    public String getName() {

	return null;
    }

    public void setWeapon(KnightWeapon knightWeapon) {
    }

    public KnightWeapon getWeapon() {
	return null;
    }

    public Knight cloneKnight() throws CloneNotSupportedException {
	return (Knight) this.clone();
    }

    public Integer getDamage() {
	return 0;
    }

    public void readQuest(String questDetails) {
    }

    public Double getArmor() {
	return 0.0;
    }

    public void reduceArmor(Double reduceValue) {
    }

}
