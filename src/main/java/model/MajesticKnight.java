package model;

/**
 * 
 * @author prvoslav
 *
 */
public class MajesticKnight extends AbstractKnight implements Knight, Cloneable {

    public String getName() {
	return "Majestic is my fathers name and so is mine!";
    }

    @Override
    public String toString() {
	return "MajesticKnight [getName()=" + getName() + ", getWeapon()=" + getWeapon() + "]";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
	return super.clone();
    }

}
