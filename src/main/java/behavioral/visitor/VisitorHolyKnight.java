package behavioral.visitor;

import model.HolyKnight;

public class VisitorHolyKnight extends HolyKnight implements VisitorKnight {

    public Double accept(Visitor visitor) {
	return visitor.visit(this);
    }
}
