package FlightCustom;

public class InternationalFlight extends Flight {
	protected String countryCode;
	

public InternationalFlight(String airline, String flightId,double price, int seats, String countryCode) {
	super( airline,  flightId, price,  seats);
	this.countryCode = countryCode;
}

@Override
public  double getPrice() {
	return price * 100;
}

public void display() {
	System.out.println("State Code : " +countryCode);
	System.out.println(super.toString());
}

}
