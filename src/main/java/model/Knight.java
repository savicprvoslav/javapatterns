package model;

public interface Knight {
    String getName();

    void setWeapon(KnightWeapon knightWeapon);

    Knight cloneKnight() throws CloneNotSupportedException;
    
    Integer getDamage();

}
