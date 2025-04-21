package resturantPack;
import java.util.*;

public class Resturant {
    private String name;
    private List<String> menu;
    private List<String> orders;
    private Map<Customer, List<String>> customerOrders;

    public Resturant(String name, List<String> menu) {
        this.name = name;
        this.menu = menu;
        this.orders = new ArrayList<>(); 
        this.customerOrders = new LinkedHashMap<>();
    }

    public String getName() {
        return name;
    }

    public void getMenu() {
    	System.out.println("Menu is: ");
        for(String s : menu)
        	System.out.print(s+",");
        	
    }

    public void setOrder(String item) {
    	try {
        if (!menu.contains(item)) {
            throw new MenuItemNotFoundException();
        }

        if (orders.size() >= 5) {
            throw new OrderLimitException();
        }

        orders.add(item);
    	}
    	catch(Exception e) {
    		System.out.println(e.getMessage());
    	}
    	
    }
    
    public void getOrder(Customer c) {
    	customerOrders.put(c,orders);
    	System.out.println("\n Sir your id is " +c.getOrderId());
    	System.out.println(orders.toString());
    	
    	
    }
    
    
    @Override
    public String toString(){
    	return name;
    }
    
    public void getllOrders() {
    	for(Map.Entry<Customer, List<String>> entry : customerOrders.entrySet()) {
    		System.out.println(entry.getKey().getName());
    		System.out.println(entry.getValue().toString());
    	}
    }
    
}
