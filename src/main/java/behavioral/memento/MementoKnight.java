package behavioral.memento;

import model.Knight;

/**
 * 
 * @author prvoslav
 *
 */
public interface MementoKnight extends Knight {
    
    Memento getMemento();
    
    void setMemento(Memento knightMemento);

}
