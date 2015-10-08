package behavioral.visitor;

import model.HolyKnight;

/**
 * 
 * @author prvoslav
 *
 * Implementation of visitor knight
 */
public class VisitorHolyKnight extends HolyKnight implements VisitorKnight {

    public Double accept(Visitor visitor) {
	return visitor.visit(this);
    }
}
