package creational.factorymethod;

import model.Knight;
import model.KnightWeapon;

public class Main {

    public static void main(String[] args) {
	Factory factory = new MajesticFactory();
	Knight knight = factory.createKnight(KnightWeapon.DOUBLE_SWORD);
	System.out.println(knight);
    }
}
