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

    /**
     * 
     * @return Knight
     */
    public Knight getKnight() {
	return knight;
    }

    /**
     * Creates  HolyKnight
     */
    public void createFightingHolyKnight() {
	knight = new HolyKnight();
	knight.setWeapon(KnightWeapon.DOUBLE_SWORD);
    }

    /**
     * Creates MajesticKnight
     */
    public void createFightingMajesticKnight() {
	knight = new MajesticKnight();
	knight.setWeapon(KnightWeapon.SWORD);
    }
}
