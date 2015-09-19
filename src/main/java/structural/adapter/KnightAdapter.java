package structural.adapter;

import model.Knight;
import model.KnightWeapon;

/**
 * 
 * @author prvoslav
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

}
