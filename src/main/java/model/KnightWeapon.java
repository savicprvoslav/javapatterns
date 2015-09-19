package model;

/**
 * 
 * @author prvoslav
 *
 */
public enum KnightWeapon {
    SWORD(10), DOUBLE_SWORD(19), FAITH(1);
    
    /**
     * Damage this weapon can do
     */
    private Integer damage;

    private KnightWeapon(Integer damage) {
	this.damage = damage;
    }

    public Integer getDamage() {
	return damage;
    }
}
