package behavioral.nullobject;

import model.Knight;
import model.KnightWeapon;

/**
 * 
 * @author prvoslav
 * 
 *         NullObject pattern demonstration. THis is how to create a knight good
 *         for nothing :), a knight that does not do anything. This is
 *         especially use full when we do not want to have null attributes, we
 *         can just pass a nullObject.
 *
 */
public class NullObjectKnight implements Knight {

    public String getName() {
	return "";
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
