package behavioral.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author prvoslav
 *
 */
public class Caretaker {

    private List<Memento> pointsInHistory = new ArrayList<Memento>();

    public void addMemento(Memento memento) {
	pointsInHistory.add(memento);
    }

    public Memento getMemento(Integer location) {
	if (location < 0 || location > pointsInHistory.size()) {
	    return null;
	}
	return pointsInHistory.get(location);
    }

}
