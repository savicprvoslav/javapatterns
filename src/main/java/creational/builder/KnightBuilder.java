package creational.builder;

import model.HolyKnight;
import model.Knight;
import model.KnightWeapon;
import model.MajesticKnight;

/**
 * 
 * @author prvoslav
 *
 */
public class KnightBuilder {
    private Knight knight = null;

    public Knight getKnight() {
	return knight;
    }

    public void createFightingHolyKnight() {
	knight = new HolyKnight();
	knight.setWeapon(KnightWeapon.DOUBLE_SWORD);
    }

    public void createFightingMajesticKnight() {
	knight = new MajesticKnight();
	knight.setWeapon(KnightWeapon.SWORD);
    }
}
