package creational.factorymethod;

import model.Knight;
import model.KnightWeapon;

/**
 * 
 * @author prvoslav
 *
 */
public class Main {

    public static void main(String[] args) {
	//craete factory
	Factory factory = new MajesticFactory();
	//call the method
	Knight knight = factory.createKnight(KnightWeapon.DOUBLE_SWORD);
	//demonstrate
	System.out.println(knight.getName());
    }
}
