package BookManagementSystem;

import java.util.Objects;

public class Book {
 private int id;
 private double price;
 private String title;
 private String author;
 private boolean isAvailable;
 
 public Book(int id, String title, String author, double price) {
	 this.id = id;
	 this.title = title;
	 this.author = author;
	 this.price = price;
	 isAvailable = true;
			 
	 
 }
 public double getPrice() {
	 return price;
 }
 
 public int getId() {
	 return id;
 }
 
 public String getTitle() {
	 return title;
 }
 public String getAuthor() {
	 return author;
 }
 public boolean getIsAvailable() {
	 return isAvailable;
 }
 
 public boolean borrowBook() {
	 isAvailable = !isAvailable;
	 return true;
 }
 
 public boolean returnBook() {
	 isAvailable = true;
	 return isAvailable;
 }
 
 @Override 
 public String toString() {
	 return "id: " +id +" title: " + title + " Available:" + isAvailable + " Price: " +price ;
 }
 
 @Override 
 public boolean equals(Object obj){
	 Book b = (Book) obj;
	 return title.equalsIgnoreCase(b.getTitle());
	  
 }
 
 @Override
 public int hashCode(){
	 return Objects.hash(title);
 }
 
 
}
