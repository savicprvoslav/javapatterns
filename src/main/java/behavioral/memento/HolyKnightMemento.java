package behavioral.memento;

import model.HolyKnight;

/**
 * 
 * @author prvoslav
 * 
 *  Implementation of holy knight with memento ability
 *
 */
public class HolyKnightMemento extends HolyKnight implements MementoKnight {

    public Memento getMemento() {
	return new Memento(getWeapon());
    }

    public void setMemento(Memento knightMemento) {
	setWeapon(knightMemento.getWeapon());
    }

}
