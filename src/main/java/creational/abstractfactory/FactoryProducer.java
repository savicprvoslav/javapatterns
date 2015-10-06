package creational.abstractfactory;

import model.KnightFamily;

/**
 * 
 * @author prvoslav
 *
 */
public class FactoryProducer {

    public static Factory getFactory(KnightFamily family) {
	if (KnightFamily.HOLY.equals(family)) {
	    return new HolyFactory();

	} else if (KnightFamily.MAJESTIC.equals(family)) {
	    return new MajesticFactory();
	}
	//throw an exception here
	return null;
    }
}
