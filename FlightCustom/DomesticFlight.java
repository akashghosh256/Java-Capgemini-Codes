package FlightCustom;

public class DomesticFlight extends Flight {
  
	protected String stateCode;
	
	public DomesticFlight(String airline, String flightId,double price, int seats, String stateCode) {
		super( airline,  flightId, price,  seats);
		this.stateCode = stateCode;
	}
	
	@Override
	public double getPrice() {
		return price*0.9;
	}
	
	
	
	
	public void display() {
		System.out.println("State Code : " +stateCode);
		System.out.println(super.toString());
	}
	
}
