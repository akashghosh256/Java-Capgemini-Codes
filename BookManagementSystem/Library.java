package BookManagementSystem;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Library {
static ArrayList<Book> books = new ArrayList<>();
static Set<Book> setBook = new HashSet<>();
static HashMap<Integer, Person> members = new LinkedHashMap<>();

public void distinctAuthors() {
	System.out.println("\n Authors:");
	
	List<String> authors = books.stream().map(book -> book.getAuthor() ).distinct().collect(Collectors.toList());
	authors.forEach(System.out::println);
		
}


public  void partitionBooksByAvailability() {
Map<Boolean, List<Book>> part = books.stream().collect(Collectors.partitioningBy(Book::getIsAvailable));
part.entrySet().stream().forEach(null);
}

public void shortestTitle() {
	Book title = books.stream().min(Comparator.comparing(book -> book.getTitle().length())).orElse(null);
	System.out.println("Short title: "+title.getTitle());
}

public void sortBooksByTitleId() {
	System.out.println("\n Sort Books");
	books = (ArrayList<Book>) books.stream().sorted(Comparator.comparing(Book::getTitle).thenComparing(Book::getId)).collect(Collectors.toList());
 books.forEach(System.out::println);
	
}

public void duplicateTitles() {
	System.out.println("\n Duplicate title ");
	Map<String, Long> duplicate = books.stream().map(book -> book.getTitle().toLowerCase()).collect(Collectors.groupingBy(title -> title, Collectors.counting()));
	duplicate.entrySet().stream().filter(entry -> entry.getValue()>1).forEach(System.out::println);
}


public void countAvailablity(){
//List<Book> availbooks =	books.stream().filter(b-> b.getIsAvailable() == true).collect(Collectors.toList());
//List<Book> unavailbooks =	books.stream().filter(b-> b.getIsAvailable() == false).collect(Collectors.toList());
//
//System.out.println("Avail books "+availbooks.size());
//System.out.println("UnAvail books "+unavailbooks.size());
	
	Map<Boolean, Long> availCount = books.stream().collect(Collectors.groupingBy(Book::getIsAvailable, Collectors.counting()));
	System.out.println("Avail count: "+availCount.getOrDefault(true, 0L));
	System.out.println("UnAvail count: "+availCount.getOrDefault(false, 0L));

	
}
	
public  void addBook(Book book) {
	books.add(book);
	setBook.add(book);
	
}


public void getHighestPrice() {
	Book high = books.stream().sorted(Comparator.comparing(Book::getPrice).reversed()).findFirst().orElse(null);
	System.out.println("\nhihest price is " + high);
}


public void getGroupBookAuthor() {
	HashMap<String, List<Book>> map = (HashMap<String, List<Book>>) books.stream().collect(Collectors.groupingBy(Book::getAuthor));
	
	map.forEach((author,booklist)->{
		System.out.println();
		System.out.println(author);
		booklist.forEach(System.out::print);

});
}



public  void registerMember(Person person) {
	members.put(person.id, person);
}

public  boolean borrowBook(int memberId, int bookId) throws BookNotAvailableException {
	Book book = books.stream().filter( i -> i.getId() == bookId).findFirst().orElse(null);
	
	if(book == null)
		throw new BookNotAvailableException("Book name not found");
	
	if(!book.getIsAvailable()) throw new BookNotAvailableException("Book found but not Available");
	
	book.borrowBook();
	return true;
			
			
			
}
public  boolean returnBook(int bookId) throws BookNotAvailableException {
	Book book = books.stream().filter(i->i.getId() == bookId).findFirst().orElse(null);
	if(book == null) {
		throw new BookNotAvailableException("Book name not found");	
	}
	return book.returnBook();



}
public  void showAvailableBooks() {
	List<Book> availBook = books.stream().filter(i->i.getIsAvailable() == true).collect(Collectors.toList());
	availBook.forEach(System.out::println);
//	for(Book i : setBook)
//		System.out.println(i);
}

public  void showBooksByAuthor(String author) {
	List<String> titles = books.stream().filter(i->i.getAuthor().equalsIgnoreCase(author)).map(Book::getTitle).collect(Collectors.toList());
	titles.forEach(System.out::println);
}
	
	

}
