/**
 * 
 */
package test;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import dungeon.Room;

/**
 * @author crosetti
 *
 */
public class RoomTest {

	@Test
	public void constructorType() {
		Room r = new Room("trap");
		assertTrue("trap".equals(r.getType()));
	}

	@Test
	public void neighbouringRooms() {
		Room r = new Room("entrance");
		Room r2 = new Room("trap");

		r.addNeighbouringRoom(r2, "west");

		assertNull(r.getNeighbouringRoom("north"));
		assertTrue(r2.equals(r.getNeighbouringRoom("west")));
	}

}
