package structural.privateclassdata;

import model.KnightWeapon;

public class Main {

    public static void main(String[] args) {
	PrivateHolyKnight holyKnight = new PrivateHolyKnight(KnightWeapon.DOUBLE_SWORD);
	System.out.println(holyKnight.getName() + " " + holyKnight.getDamage());
	// Holy Knight is my name! 19
    }

}
