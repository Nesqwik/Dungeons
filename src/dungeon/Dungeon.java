/**
 * Dungeon
 * 
 */
package dungeon;

import java.util.Scanner;

/**
 * @author Louis
 * 
 */
public class Dungeon {
	private Room currentRoom;
	private final Scanner scanner = new Scanner(System.in);

	/**
	 * Create new dungeon with the start room 
	 * @param firstRoom the entrance room.
	 */
	public Dungeon(final Room firstRoom) {
		this.currentRoom = firstRoom;
	}

	/**
	 * Execute the command associate to the input if exists.
	 * @param command input command from the user
	 */
	public void executeCommand(String command) {
		Room nextRoom = null; // room.getNextRoom(command);
		if (nextRoom != null) {
			currentRoom = nextRoom;
		} else {
			System.out.println("Oups, il n'y a pas de chemin ici !");
		}
	}

	public String readCommand() {
		return scanner.nextLine();
	}
}
