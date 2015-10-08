package behavioral.observer;

/**
 * 
 * @author prvoslav
 *
 * Observer pattern test.
 *
 */
public class Main {

    public static void main(String[] args) {
	KnightObserver knight = new ObserverHolyKnight();
	
	Observer observer = new ArmorObserver(knight);
	knight.addObserver(observer);
	
	knight.reduceArmor(3.4);
	//Observer : Update armor UI 96.6
    }

}
