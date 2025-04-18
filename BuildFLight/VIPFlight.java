package BuildFLight;

public class VIPFlight extends Flight{
	
public VIPFlight(String airline, double price,String flightNumber) {
	super(airline, price, flightNumber);
}

@Override
public boolean addPassenger(Passenger passenger) {
	if(passenger.isVIP()) {
		passengers.add(passenger);
		return true;
	}
	System.out.println("Only for VIP");
	return false;
}

}
