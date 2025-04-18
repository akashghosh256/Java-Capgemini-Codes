package BuildFLight;
import java.util.*;

public class FlightPriceComparator implements Comparator<Flight>{
@Override 
public int compare(Flight f1, Flight f2) {
	return Double.compare(f2.getPrice(), f1.getPrice());
}

}
