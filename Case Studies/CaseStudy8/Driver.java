package CaseStudy8;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Enter 1.Bike\nEnter 2.Car\nElse to exit.");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:{
				
				System.out.println("Enter the vehical number=");
				String vehicleNumber = sc.nextLine();
				
				System.out.println("Enter the vehical brand=");
				String brand=sc.nextLine();
				System.out.println("Enter the vehical model=");
				String model=sc.nextLine();
				System.out.println("Enter the vehical rental price=");
				double rentalPricePerDay = sc.nextDouble();
				System.out.println("Enter true if availabe else false=");
				boolean iaAvailable=sc.nextBoolean();
				System.out.println("Enter true if gears are available, else false=");
				boolean hasGear=sc.nextBoolean();
				Bike bike = new Bike(vehicleNumber,brand,model,rentalPricePerDay,iaAvailable,hasGear);
				bike.diplayDetails();
				break;
			}
			case 2:{
				System.out.println("Enter the vehical number=");
				String vehicleNumber = sc.nextLine();
				System.out.println();
				System.out.println("Enter the vehical brand=");
				String brand=sc.nextLine();
				System.out.println("Enter the vehical model=");
				String model=sc.nextLine();
				System.out.println("Enter the vehical rental price=");
				double rentalPricePerDay = sc.nextDouble();
				System.out.println("Enter true if availabe, else false=");
				boolean iaAvailable=sc.nextBoolean();
				System.out.println("Enter number of doors=");
				int numberOfDoors=sc.nextInt();
				Car car = new Car(vehicleNumber,brand,model,rentalPricePerDay,iaAvailable,numberOfDoors);
				car.displayDetail();
				break;
			}
			default:{
				sc.close();
				System.exit(0);
			}
				
	
			
		}
		
	}

	}}
