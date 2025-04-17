package manage_Books;

import java.util.Comparator;

public class BookById implements Comparator<Book>{
	@Override
	public int compare(Book o1, Book o2) {
		return Integer.compare(o1.getId(), o2.getId());
	}

}
