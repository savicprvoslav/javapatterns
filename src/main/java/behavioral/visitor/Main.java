package behavioral.visitor;

/**
 * 
 * @author prvoslav
 * 
 * Demonstration of visitor pattern.
 */
public class Main {

    public static void main(String[] args) {
	VisitorKnight knightVisitor = new VisitorHolyKnight();
	knightVisitor.reduceArmor(0.3);
	Visitor visitor = new Visitor() {

	    public Double visit(VisitorHolyKnight holyKnight) {
		return holyKnight.getArmor();
	    }
	};

	System.out.println("Armor :" + knightVisitor.accept(visitor));
	//Armor :99.7
    }
}
