package behavioral.visitor;

import model.Knight;

/**
 * 
 * @author prvoslav
 * 
 * Knight that can be visited
 */
public interface VisitorKnight extends Knight {
    Double accept(Visitor knightVisitor);
}
