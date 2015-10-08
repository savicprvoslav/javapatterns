package behavioral.command;

import model.HolyKnight;
import model.Knight;

/**
 * 
 * @author prvoslav
 *
 *         Main class for testing command pattern. Creating a knight and command
 *         that will teleport it self to London ( if one existed at that time).
 * 
 */
public class Main {

    public static void main(String[] args) {

	Knight knight = new HolyKnight();

	// This would make a nice factory method pattern usage
	Command command = new TeleportKnightCommand(knight, "London");
	if (command.execute()) {
	    System.out.println("Knight teleported");
	}
    }

    // Teleporting knight 'Holy Knight is my name!' to London
    // Knight teleported

}
