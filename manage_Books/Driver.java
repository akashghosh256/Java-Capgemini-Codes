package manage_Books;

import java.util.*;

public class Driver {
public static void main(String[] args) {
	Set<Book> set = new TreeSet<>();
	set.add(new Book(2,"t1",888.8));
	set.add(new Book(3,"t1",888.6));
	set.add(new Book(1,"At1",888.89));
	System.out.println(set);


}
}
