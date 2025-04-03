package Week3Day2;

public class House {
	private String colour;
	private Room room;
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
	public House(String colour, Room room) {
		this.colour = colour;
		this.room = room;
	}
		
	

}
