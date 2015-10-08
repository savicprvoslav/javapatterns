package behavioral.memento;

import model.KnightWeapon;

/**
 * 
 * @author prvoslav
 * 
 * Memento class used to remember the weapon state
 *
 */
public class Memento {

    private KnightWeapon weapon = null;

    public Memento(KnightWeapon weapon) {
	super();
	this.weapon = weapon;
    }

    public KnightWeapon getWeapon() {
	return weapon;
    }
}
