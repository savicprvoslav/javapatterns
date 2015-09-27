package behavioral.memento;

import model.KnightWeapon;

/**
 * 
 * @author prvoslav
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
