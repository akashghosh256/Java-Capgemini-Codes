package Week3Day2;

public class Driver {
	public static void main(String[] args) {
		Room room = new Room(700);
		System.out.println("Aggregtion for room area: - " +room.getArea());
		House h1 = new House("Rainbow", room);
		System.out.println("Still aggregation: -"+ h1.getRoom().getArea());
		System.out.println("Still aggregation: -"+ h1.getColour());
	}

}
