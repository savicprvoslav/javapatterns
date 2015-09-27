package behavioral.visitor;

import model.Knight;

public interface VisitorKnight extends Knight {
    Double accept(Visitor knightVisitor);
}
