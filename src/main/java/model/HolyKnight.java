package model;

/**
 * 
 * @author prvoslav
 *
 */
public class HolyKnight extends AbstractKnight implements Knight {

    public String getName() {
	return "Holy Knight is my name!";
    }

    @Override
    public String toString() {
	return "HolyKnight [getName()=" + getName() + ", getWeapon()=" + getWeapon() + "]";
    }

    @Override
    public Integer getDamage() {
	return super.getDamage() * 1;
    }
}
