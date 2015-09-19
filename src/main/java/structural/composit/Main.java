package structural.composit;

import model.HolyKnight;
import model.Knight;
import model.KnightWeapon;
import model.MajesticKnight;

/**
 * 
 * @author prvoslav Testing the composit pattern by creating an kings army with
 *         one legion of
 */
public class Main {

    public static void main(String[] args) {
	KnightArmy army = new KnightArmy();
	army.setName("Kings Army");

	Knight knightHero = new MajesticKnight();
	knightHero.setWeapon(KnightWeapon.DOUBLE_SWORD);// 57
	army.addKnight(knightHero);

	KnightArmy knightLegion = new KnightArmy();
	knightLegion.setName("Knight Legion");
	army.addKnight(knightLegion);

	Knight knight1 = new HolyKnight();
	knight1.setWeapon(KnightWeapon.DOUBLE_SWORD);// 19
	knightLegion.addKnight(knight1);

	Knight knight2 = new HolyKnight();
	knight2.setWeapon(KnightWeapon.DOUBLE_SWORD);// 19
	knightLegion.addKnight(knight2);

	Knight knight3 = new HolyKnight();
	knight3.setWeapon(KnightWeapon.DOUBLE_SWORD);// 19
	knightLegion.addKnight(knight3);

	System.out.println(army.getName() + ": " + army.getDamage());// 114
    }

}
