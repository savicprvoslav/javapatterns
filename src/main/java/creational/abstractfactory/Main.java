package creational.abstractfactory;

import model.Knight;
import model.KnightFamily;

/**
 * 
 * @author prvoslav
 *
 */
public class Main {

    public static void main(String[] args) {
	//Create factory
	Factory factory = FactoryProducer.getFactory(KnightFamily.MAJESTIC);
	//create knight
	Knight knight = factory.getKnight();
	//demonstrate that all is ok
	System.out.println(knight.getName());
    }
}
