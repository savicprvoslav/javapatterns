package behavioral.chainofresponsibility;

/**
 * 
 * @author prvoslav
 *
 */
public abstract class AbstractDragonSlayerRepresentative implements DragonSlayer {

    private DragonSlayer nextRep = null;

    public AbstractDragonSlayerRepresentative(DragonSlayer nextRep) {
	this.nextRep = nextRep;
    }

    public Boolean attack(Integer minDamage) {
	if (nextRep != null) {
	    return nextRep.attack(minDamage);
	} else {
	    throw new RuntimeException("To strong for us");
	}
    }
}
