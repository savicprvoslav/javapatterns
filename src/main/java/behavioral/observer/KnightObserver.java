package behavioral.observer;

import model.Knight;

/**
 * 
 * @author prvoslav
 *
 */
public interface KnightObserver extends Knight {

    void addObserver(Observer observer);

    void update();

}
