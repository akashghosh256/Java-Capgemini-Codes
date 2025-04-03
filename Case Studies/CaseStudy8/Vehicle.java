package CaseStudy8;

public class Vehicle {
	private String vehicleNumber;
	private String brand;
	private String model;
	private double rentalPricePerDay;
	private boolean iaAvailable;
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getRentalPricePerDay() {
		return rentalPricePerDay;
	}
	public void setRentalPricePerDay(double rentalPricePerDay) {
		this.rentalPricePerDay = rentalPricePerDay;
	}
	public boolean isIaAvailable() {
		return iaAvailable;
	}
	public void setIaAvailable(boolean iaAvailable) {
		this.iaAvailable = iaAvailable;
	}
	public Vehicle(String vehicleNumber, String brand, String model, double rentalPricePerDay, boolean iaAvailable) {
		this.vehicleNumber = vehicleNumber;
		this.brand = brand;
		this.model = model;
		this.rentalPricePerDay = rentalPricePerDay;
		this.iaAvailable = iaAvailable;
	}
	public void displayDetails() {
		System.out.println("The Vehical Number is: "+this.vehicleNumber);
		System.out.println("The Barnd is: "+this.brand);
		System.out.println("The Model is: "+this.model);
		System.out.println("The rental price is: "+this.rentalPricePerDay);
		
		
		
	}
	
	public void rentVehicle() {
		if(this.iaAvailable==true) {
			System.out.println("Available for rent!");
		}
		else {
			System.out.println(" Not Available for available!");
			
		}
		
	}
	
	

}
