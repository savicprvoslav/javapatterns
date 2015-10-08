package behavioral.observer;

import model.Knight;

/**
 * 
 * @author prvoslav
 * 
 * Knight that has observer abilities
 *
 */
public interface KnightObserver extends Knight {

    void addObserver(Observer observer);

    void update();

}
