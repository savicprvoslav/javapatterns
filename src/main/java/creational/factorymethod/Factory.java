package creational.factorymethod;

import model.Knight;
import model.KnightWeapon;

/**
 * 
 * @author prvoslav
 *
 */
public interface Factory {

    Knight createKnight(KnightWeapon weapon);
}
