package CaseStudy8;

public class Car extends Vehicle {
	private int numberOfDoors;

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	public Car(String vehicleNumber, String brand, String model, double rentalPricePerDay, boolean iaAvailable,
			int numberOfDoors) {
		super(vehicleNumber, brand, model, rentalPricePerDay, iaAvailable);
		this.numberOfDoors = numberOfDoors;
	}
	public void displayDetail() {
		super.displayDetails();
		System.out.println("The Car has "+this.numberOfDoors+" doors.");
	}
	

}
