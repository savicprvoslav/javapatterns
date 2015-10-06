package creational.builder;

import model.Knight;

/**
 * 
 * @author prvoslav
 *
 */
public class Main {

    public static void main(String[] args) {
	KnightBuilder knightBuilder = new KnightBuilder();
	
	knightBuilder.createFightingHolyKnight();
	Knight knight = knightBuilder.getKnight();//get knight
	
	System.out.println(knight.getName());
    }
}
