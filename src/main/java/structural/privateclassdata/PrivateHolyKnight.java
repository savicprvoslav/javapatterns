package structural.privateclassdata;

import model.HolyKnight;
import model.Knight;
import model.KnightWeapon;

/**
 * 
 * @author prvoslav
 *
 */
public class PrivateHolyKnight {

    private Knight knight = null;

    public PrivateHolyKnight(KnightWeapon knightWeapon) {
	knight = new HolyKnight();
	knight.setWeapon(knightWeapon);
    }

    public String getName() {
	return knight.getName();
    }

    public Integer getDamage() {
	return knight.getDamage();
    }

}
