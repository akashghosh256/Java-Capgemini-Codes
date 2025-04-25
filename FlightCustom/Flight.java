package FlightCustom;

import java.util.*;
abstract class Flight implements Bookable, Priced {
	protected int seats;
	protected double price;
	protected String airline;
	protected String flightId;
	protected Set<Passenger> passengers;
	
	public Flight(String airline, String flightId,double price, int seats) {
		this.airline = airline;
		this.flightId = flightId;
		this.seats = seats;
		this.price = price;
		passengers = new HashSet<>();
	}
	
	

	@Override
	public boolean book(Passenger p){
		if(seats>0) {
			passengers.add(p);
			seats--;
			return true;
		}
		return false;
	}
	
	@Override
	public double getPrice() {
		return price;
	}
	
	@Override 
	public boolean equals(Object o) {
		Flight f1 = (Flight) o;
		 return flightId.equals(f1.flightId);
	}
	
	@Override
	public int hashCode() {
		 return Objects.hash(flightId);
	}
	
	@Override
	public String toString() {
		return airline + " " + flightId + " " + seats;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
