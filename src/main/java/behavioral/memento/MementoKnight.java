package behavioral.memento;

import model.Knight;

/**
 * 
 * @author prvoslav
 * 
 * Knight with extra ability to create a memento and receive one
 *
 */
public interface MementoKnight extends Knight {
    
    Memento getMemento();
    
    void setMemento(Memento knightMemento);

}
