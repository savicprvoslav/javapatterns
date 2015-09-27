package model;

public abstract class AbstractKnight implements Cloneable, Knight {
    private KnightWeapon weapon = KnightWeapon.FAITH;
    private Double armor = 100d;

    public KnightWeapon getWeapon() {
	return weapon;
    }

    public void setWeapon(KnightWeapon weapon) {
	this.weapon = weapon;
    }

   

    public Knight cloneKnight() throws CloneNotSupportedException {
	return (Knight) super.clone();
    }

    public Integer getDamage() {
	return getWeapon().getDamage();
    }

    public void readQuest(String questDetails) {
	System.out.println("QUEST: " + questDetails);
    }

    public Double getArmor() {
	return armor;
    }

    public void reduceArmor(Double reduceValue) {
	this.armor -= reduceValue;
    }
}
