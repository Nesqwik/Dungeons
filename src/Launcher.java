import dungeon.Dungeon;
import dungeon.Room;

/**
 * 
 */

/**
 * @author crosetti
 *
 */
public class Launcher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Dungeon d = new Dungeon(new Room());
		String command = d.readCommand();
		d.executeCommand(command);
	}

}
