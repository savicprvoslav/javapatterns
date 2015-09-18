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

    public static void main(String[] args) {
	final String prototypeMajestic = "majestic";
	PrototypeFactory.addPrototype(prototypeMajestic, new MajesticKnight());
	PrototypeFactory.addPrototype("holy", new HolyKnight());

	PrototypeFactory factory = new PrototypeFactory();
	Knight knight = factory.getPrototype(prototypeMajestic);
	System.out.println(knight);
    }

}
