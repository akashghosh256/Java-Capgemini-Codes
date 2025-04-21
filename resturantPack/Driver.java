package resturantPack;
import java.util.*;
public class Driver {
public static void main(String[] args) {
List<Resturant> resturants = new ArrayList<Resturant>();
resturants.add(new Resturant("KFC",  new ArrayList<>(
        List.of("Geeks",
                "for",
                "Chick","Mutton", "lolipop"))));
resturants.add(new Resturant("Dominps",  new ArrayList<>(
        List.of("Papi",
                "Paparito",
                "Piizza","Chick-pizz", "lolipop"))));

for(Resturant i : resturants) {
	System.out.println(i);
	i.getMenu();
}

List<Customer> customers  = new ArrayList<Customer>();
customers.add(new Customer("Jorg", 3456));
customers.add(new Customer("Bob", 8864));
customers.add( new Customer("Joe", 5674));


Customer myself = new Customer("Joe", 5674);

if(customers.contains(myself)) {
Resturant r1 =  resturants.get(0);
r1.setOrder("Chick");
r1.setOrder("Lolipop");

r1.setOrder("pizza");

r1.setOrder("Dosa");

r1.setOrder("Mutton");
r1.setOrder("Chow");

r1.setOrder("Geeks");
r1.setOrder("Chick");

r1.setOrder("Chick");

r1.setOrder("Chick");
r1.setOrder("Chick");


r1.getOrder(myself);


}
else System.out.println("Customer not Resiterd");

resturants.get(0).getllOrders();

}
}
