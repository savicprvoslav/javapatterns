package behavioral.command;

import model.HolyKnight;
import model.Knight;

public class Main {

    public static void main(String[] args) {

	Knight knight = new HolyKnight();
	
	// This would make a nice factory method pattern usage
	Command command = new TeleportKnightCommand(knight, "Brasil");
	if (command.execute()) {
	    System.out.println("Knight teleported");
	}
    }
}
