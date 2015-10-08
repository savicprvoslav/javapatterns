package structural.adapter;

import model.Knight;
import model.KnightWeapon;

/**
 * 
 * @author prvoslav
 * 
 * Knight adapter adapts the OldKnight and allows developers to use this class as it is knight
 *
 */
public class KnightAdapter implements Knight, Cloneable {

    private OldKnight knight = null;

    public KnightAdapter() {
	knight = new OldKnight();
    }

    public String getName() {
	return knight.getSirsName();
    }

    public void setWeapon(KnightWeapon knightWeapon) {
	knight.setSirsWeapon(knightWeapon.name());
    }

    public Knight cloneKnight() throws CloneNotSupportedException {
	return (Knight) super.clone();
    }

    @Override
    public String toString() {
	return knight.toString();
    }

    public Integer getDamage() {
	return 0;
    }

    public void readQuest(String questDetails) {

    }

    public Double getArmor() {
	return 0d;
    }

    public void reduceArmor(Double reduceValue) {
	// Nothing here
    }

    public KnightWeapon getWeapon() {
	return null;
    }

}
