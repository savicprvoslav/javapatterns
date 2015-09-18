package creational.factorymethod;

import model.Knight;
import model.KnightWeapon;
import model.MajesticKnight;

/**
 * 
 * @author prvoslav
 *
 */
public class HolyFactory implements Factory {

    public Knight createKnight(KnightWeapon weapon) {
	Knight knight = new MajesticKnight();
	knight.setWeapon(weapon);
	return knight;
    }
}
