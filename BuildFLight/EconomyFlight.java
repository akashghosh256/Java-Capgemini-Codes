package BuildFLight;

public class EconomyFlight extends Flight{
	
	public EconomyFlight(String airline, double price,String flightNumber) {
		super(airline, price, flightNumber);
	}
	
	@Override
	public boolean addPassenger(Passenger passenger){
		passengers.add(passenger);
		return true;
	}

	

}
