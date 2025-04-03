package Week3Day2;

public class HouseComp {
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
	public HouseComp(String colour, double area) {
		this.colour = colour;
		room = new Room(area);

	}}
