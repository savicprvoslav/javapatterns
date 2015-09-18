package model;

public class AbstractKnight implements Cloneable {
    private KnightWeapon weapon = KnightWeapon.FAITH;

    public KnightWeapon getWeapon() {
	return weapon;
    }

    public void setWeapon(KnightWeapon weapon) {
	this.weapon = weapon;
    }

    public Knight cloneKnight() throws CloneNotSupportedException {
	return (Knight) super.clone();
    }
}
