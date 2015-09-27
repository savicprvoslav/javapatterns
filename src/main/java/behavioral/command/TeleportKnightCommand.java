package behavioral.command;

import model.Knight;

/**
 * 
 * @author prvoslav
 *
 */
public class TeleportKnightCommand implements Command {

    private Knight knight;
    private String destination;

    public TeleportKnightCommand(Knight knight, String destination) {
	this.knight = knight;
	this.destination = destination;
    }

    public Boolean execute() {
	System.out.println("Teleporting knight '" + knight.getName() + "' to " + this.destination);
	return true;
    }
}
