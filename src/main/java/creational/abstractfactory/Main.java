package creational.abstractfactory;

import model.Knight;
import model.KnightFamily;

public class Main {

    public static void main(String[] args) {
	Factory factory = FactoryProducer.getFactory(KnightFamily.MAJESTIC);
	Knight knight = factory.getKnight();
	System.out.println(knight.getName());
    }
}
