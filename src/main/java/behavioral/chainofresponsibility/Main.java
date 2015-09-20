package behavioral.chainofresponsibility;

import model.HolyKnight;
import model.Knight;
import model.KnightWeapon;

/**
 * 
 * @author prvoslav
 *
 */
public class Main {

    public static void main(String[] args) {
	Knight knight1 = new HolyKnight();
	knight1.setWeapon(KnightWeapon.DOUBLE_SWORD);

	DragonSlayerHandler dragonSlayerHandler1 = new DragonSlayerAgencyImpl(null, knight1);

	Knight knight2 = new HolyKnight();
	knight2.setWeapon(KnightWeapon.SWORD);

	DragonSlayerHandler dragonSlayerHandler2 = new DragonSlayerAgencyImpl(dragonSlayerHandler1, knight2);

	Knight knight3 = new HolyKnight();
	knight3.setWeapon(KnightWeapon.FAITH);

	DragonSlayerHandler root = new DragonSlayerAgencyImpl(dragonSlayerHandler2, knight3);

	if (root.attack(18)) {
	    System.out.println("Dragon way slayed!");
	} else {
	    System.out.println("Knight was sleapy today");
	}

	// To strong for me 1 > 18
	// To strong for me 10 > 18
	// Dragon way slayed!

    }
}
