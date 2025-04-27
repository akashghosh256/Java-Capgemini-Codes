package BookManagementSystem;

import java.util.Comparator;

public class BookComparator implements Comparator<Book>{
	
	@Override
	public int compare(Book b1, Book b2) {
		if(b1.getTitle().compareTo(b2.getTitle()) !=0)
			return b1.getTitle().compareTo(b2.getTitle());
		if(b1.getAuthor().compareTo(b2.getAuthor()) !=0)
			return b1.getAuthor().compareTo(b2.getAuthor());
   return Double.compare(b1.getPrice(), b2.getPrice());
			
		
		
	}

}
