/**
 * 
 */
package dungeon;

import java.util.HashMap;
import java.util.Map;

/**
 * @author crosetti
 * 
 */
public class Room {
	private final String type;
	private final Map<String, Room> neighbouringRooms;

	public Room(String type) {
		this.type = type;
		neighbouringRooms = new HashMap<String, Room>();
	}

	/**
	 * Returns the room to which the specified access leads, or null if this room has no such access
	 * @param access the access whose associated room is to be returned
	 * @return the room to which the specified access leads or null if the access doesn't exist
	 */
	public Room getNeighbouringRoom(String access) {
		return neighbouringRooms.get(access);
	}

	/**
	 * Associates the specified room to the specified access as a neighbour to this room
	 * @param r the room which is to be added as a neighbouring room
	 * @param access the access associated to the specified room
	 */
	public void addNeighbouringRoom(Room r, String access) {
		neighbouringRooms.put(access, r);
	}

	public String getType() {
		return type;
	}

}
