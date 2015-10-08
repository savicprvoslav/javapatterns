package behavioral.chainofresponsibility;

import model.HolyKnight;
import model.Knight;
import model.KnightWeapon;

/**
 * 
 * @author prvoslav
 * 
 *         Main class that tests the chain of responsibility by creating a chain
 *         of dragon slayer representatives and asking the head to attack. Chain
 *         communicates between elements to find appropriate solution.
 *
 */
public class Main {

    public static void main(String[] args) {
	Knight knight1 = new HolyKnight();
	knight1.setWeapon(KnightWeapon.DOUBLE_SWORD);

	DragonSlayer dragonSlayerHandler1 = new DragonSlayerRepresentitive(null, knight1);

	Knight knight2 = new HolyKnight();
	knight2.setWeapon(KnightWeapon.SWORD);

	DragonSlayer dragonSlayerHandler2 = new DragonSlayerRepresentitive(dragonSlayerHandler1, knight2);

	Knight knight3 = new HolyKnight();
	knight3.setWeapon(KnightWeapon.FAITH);

	DragonSlayer root = new DragonSlayerRepresentitive(dragonSlayerHandler2, knight3);

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
