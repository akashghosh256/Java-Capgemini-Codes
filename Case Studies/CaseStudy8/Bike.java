package CaseStudy8;

public class Bike extends Vehicle {
	private boolean hasGear;

	public boolean isHasGear() {
		return hasGear;
	}

	public void setHasGear(boolean hasGear) {
		this.hasGear = hasGear;
	}
	
	public Bike(String vehicleNumber, String brand, String model, double rentalPricePerDay, boolean iaAvailable,
			boolean hasGear) {
		super(vehicleNumber, brand, model, rentalPricePerDay, iaAvailable);
		this.hasGear = hasGear;
	}

	public void diplayDetails() {
		super.displayDetails();
		if(this.hasGear==true) {
			System.out.println("The bike has gears.");
		}
		else {
			System.out.println("The bike has no gears.");
			
		}
		
	}

}
