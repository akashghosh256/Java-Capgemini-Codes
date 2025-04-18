package BuildFLight;
import java.util.*;

public abstract class Flight {
	private String airline;
	private double price;
	private String flightNumber;
	protected List<Passenger> passengers;
	
	public Flight(String airline, double price, String flightNumber) {
		this.airline = airline;
		this.price = price;
		this.flightNumber = flightNumber;
		passengers = new ArrayList<>();
	}
	

//	public Flight(String airline2, double price2, String flightNumber2) {
//		// TODO Auto-generated constructor stub
//	}


	public String getFlightNumber() {
		return flightNumber;
	}
	
	public String getAirline() {
		return airline;
	}
	
	public double getPrice() {
		return price;
	}
	
	
	   public void showPassengers() {
	        System.out.println("Flight " + flightNumber + " (" + airline + ", Rs" + price + ")");
	        for (Passenger p : passengers) {
	            System.out.println(p);
	        }
	    }
	
	public abstract boolean addPassenger(Passenger passenger);
	
	@Override 
	public boolean equals(Object obj) {
//		Flight ft = (Flight) obj;
//		return this.getAirline().equals(ft.getAirline());
		 if (this == obj) return true;
		    if (obj == null || getClass() != obj.getClass()) return false;
		    Flight ft = (Flight) obj;
		    return this.getAirline().equals(ft.getAirline());
	}
	
	@Override
	public int hashCode(){
		return Objects.hash(airline);
	}
	
 @Override
 public String toString() {
	 return "Flight is: " + flightNumber + " (" + airline + ", Rs" + price + ")";

 }

}
