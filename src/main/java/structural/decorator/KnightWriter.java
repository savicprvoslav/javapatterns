package structural.decorator;

import model.Knight;
import model.KnightWeapon;

/**
 * 
 * @author prvoslav
 *
 * Knight Writer decorator, decorates by writing a knight story of life.
 * 
 */
public class KnightWriter implements Knight {

    private Knight knight;

    public KnightWriter(Knight knight) {
	this.knight = knight;
    }

    public String getName() {
	System.out.println("Knight has been asked for the name");
	return knight.getName();
    }

    public void setWeapon(KnightWeapon knightWeapon) {
	System.out.println("Knight has given his weapon.");
	knight.setWeapon(knightWeapon);
    }

    public Knight cloneKnight() throws CloneNotSupportedException {
	return knight.cloneKnight();
    }

    public Integer getDamage() {
	return knight.getDamage();
    }

    public void readQuest(String questDetails) {
	knight.readQuest(questDetails);
    }

    public Double getArmor() {
	return knight.getArmor();
    }

    public void reduceArmor(Double reduceValue) {
	System.out.println("Knight armor has been damaged!!");
	knight.reduceArmor(reduceValue);
    }
    public KnightWeapon getWeapon() {
	return knight.getWeapon();
    }
}
