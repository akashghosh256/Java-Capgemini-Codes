package FlightCustom;

import java.util.Objects;

public class Passenger {

private String name;
private long passNumber;

public Passenger(String name, long passNumber){
	this.name = name;
	this.passNumber = passNumber;
}

public String getName() {
	return name;
}

public long getPassNum() {
	return passNumber;
}

@Override
public boolean equals(Object o) {
	Passenger p = (Passenger) o;
	return passNumber == p.getPassNum();
}

@Override 
public int hashCode() {
	return Objects.hash(passNumber);
}

@Override 
public String toString() {
	return "Name: " + name + " Passnumber : " + passNumber;
}
	
}
