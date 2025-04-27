package BookManagementSystem;

public class BookNotAvailableException extends Exception {
	
	static String message = "BookNotAvailableException found";
	
	BookNotAvailableException(){
		super(message);
	}
	
	public BookNotAvailableException(String msg) {
		super(msg);
	}
	
	

}
