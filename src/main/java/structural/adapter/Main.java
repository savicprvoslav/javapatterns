package structural.adapter;

import model.Knight;
import model.KnightWeapon;

/**
 * 
 * @author prvoslav
 *
 */
public class Main {
    
    public static void main(String[] args)
    {
	Knight knight = new KnightAdapter();//create instance of KnightAdapter
	knight.setWeapon(KnightWeapon.DOUBLE_SWORD);
	
	//verify
	System.out.println(knight.getName());//Old Knight is my name.
    }

}
