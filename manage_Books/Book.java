package manage_Books;

import java.util.*;

public class Book implements Comparable<Book>{
 private int id;
 private String title;
 private double price;
 
 public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public Book(int id, String title, double price ) {
	this.id = id;
	this.title = title;
	this.price = price;
}
 @Override
 public String toString() {
	 return "\n[" + id + "| " + title + " | " + price + "]";
 }
@Override
public int compareTo(Book o) {
	
	return Integer.compare(o.id, this.id);
}

@Override
public boolean equals(Object o) {
	Book b = (Book)o;
	return this.id == b.id &&
			Double.compare(this.price, b.price) == 0 &&
			this.getTitle().equals(b.getTitle());
}


 
}
