package resturantPack;

import java.util.Objects;

public class Customer {
	private String name;
	private  int orderId;
	
	public Customer(String name, int orderId) {
		this.name = name;
		this.orderId = orderId;
	}
	public String getName() {
		return name;
	} 
	public int getOrderId() {
		return orderId;
	}
	
	@Override 
	public boolean equals(Object obj){
		Customer t = (Customer) obj;
		
		if(this.orderId == t.getOrderId()) return true;
		return false;
		 
	}
	@Override
	public int hashCode() {
	 return Objects.hash(orderId);
	}

}
