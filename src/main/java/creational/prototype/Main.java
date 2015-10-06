package creational.prototype;

import model.HolyKnight;
import model.Knight;
import model.MajesticKnight;

/**
 * 
 * @author prvoslav
 *
 */
public class Main {

    final static String prototypeMajestic = "majestic";

    public static void initPrototype() {
	PrototypeFactory.addPrototype(prototypeMajestic, new MajesticKnight());
	PrototypeFactory.addPrototype("holy", new HolyKnight());
    }

    public static void main(String[] args) {
	//init prototype
	initPrototype();

	//get prototype
	PrototypeFactory factory = new PrototypeFactory();
	Knight knight = factory.getPrototype(prototypeMajestic);
	System.out.println(knight.getName());
    }

}
