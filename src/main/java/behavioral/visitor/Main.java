package behavioral.visitor;

public class Main {

    public static void main(String[] args) {
	VisitorKnight knightVisitor = new VisitorHolyKnight();

	Visitor visitor = new Visitor() {

	    public Double visit(VisitorHolyKnight holyKnight) {
		return holyKnight.getArmor();
	    }
	};

	System.out.println("Armor :" + knightVisitor.accept(visitor));

    }
}
