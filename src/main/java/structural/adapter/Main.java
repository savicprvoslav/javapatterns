package structural.adapter;

import model.Knight;
import model.KnightWeapon;

public class Main {
    
    public static void main(String[] args)
    {
	Knight knight = new KnightAdapter();
	knight.setWeapon(KnightWeapon.DOUBLE_SWORD);
	System.out.println(knight);
    }

}
