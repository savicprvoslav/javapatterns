package model;

public interface Knight {
    String getName();

    void setWeapon(KnightWeapon knightWeapon);

    KnightWeapon getWeapon();

    Knight cloneKnight() throws CloneNotSupportedException;

    Integer getDamage();

    void readQuest(String questDetails);

    Double getArmor();

    void reduceArmor(Double reduceValue);

}
