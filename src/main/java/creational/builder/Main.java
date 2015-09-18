package creational.builder;

import model.Knight;

public class Main {

    public static void main(String[] args) {
	KnightBuilder knightBuilder = new KnightBuilder();
	
	knightBuilder.createFightingHolyKnight();
	Knight knight = knightBuilder.getKnight();
	
	System.out.println(knight);
    }
}
