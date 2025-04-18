package BuildFLight;
import java.util.*;

public class Driver {
	public static void main(String[] args) {
		System.out.println(" Start ");
    
		//Set<Flight> flights = new HashSet<>();
		List<Flight> flights = new LinkedList<>();

        flights.add(new EconomyFlight("Indigo", 3500.0, "A3453"));
        flights.add(new VIPFlight("Vistar", 8000.0, "B4556"));
        flights.add(new EconomyFlight("Spice", 2800.0, "XCV34"));
        flights.add(new EconomyFlight("Indigo", 92800.0, "CVku"));
        
        flights.sort(new FlightPriceComparator());

        


		
        for (Flight f : flights) {
           System.out.println(f);
            System.out.println("------");
        }
		

		
	}

}
