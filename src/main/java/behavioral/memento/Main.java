package behavioral.memento;

import model.KnightWeapon;

/**
 * 
 * @author prvoslav
 *
 *         Main class that demonstrates memento pattern. At first we create a
 *         holy memento knight and create a memento. After chaning the weapon to
 *         the knight we can use previously created memento.
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

	// Init Weapon: FAITH
	// Changed Weapon to: DOUBLE_SWORD
	// Return to init Weapon: FAITH

    }

}
