package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

import model.HolyKnight;

/**
 * 
 * @author prvoslav
 * 
 * Implementation of observer knight, it calls all observers when armor is reduced
 *
 */
public class ObserverHolyKnight extends HolyKnight implements KnightObserver {

    private List<Observer> observers = new ArrayList<Observer>();

    public void addObserver(Observer observer) {
	observers.add(observer);
    }

    public void update() {
	for (Observer observer : observers) {
	    observer.update();
	}
    }
    
    @Override
    public void reduceArmor(Double reduceValue) {
        super.reduceArmor(reduceValue);
        update();
    }

}
