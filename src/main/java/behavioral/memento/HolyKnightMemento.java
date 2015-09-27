package behavioral.memento;

import model.HolyKnight;

/**
 * 
 * @author prvoslav
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
