package behavioral.memento;

import model.KnightWeapon;

/**
 * 
 * @author prvoslav
 *
 */
public class Main {

    public static void main(String[] args) {
	Caretaker caretaker = new Caretaker();

	MementoKnight knight = new HolyKnightMemento();
	System.out.println("Init Weapon: " + knight.getWeapon());

	caretaker.addMemento(knight.getMemento());

	knight.setWeapon(KnightWeapon.DOUBLE_SWORD);
	System.out.println("Changed Weapon to: " + knight.getWeapon());

	knight.setMemento(caretaker.getMemento(0));
	System.out.println("Return to init Weapon: " + knight.getWeapon());

    }

}
