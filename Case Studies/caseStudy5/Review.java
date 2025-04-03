package CaseStudy5;

public class Review {
	private String message;
	private Product prod;
	public Review(String message, Product prod) {
		
		this.message = message;
		this.prod = prod;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	

	public Product getProd() {
		return prod;
	}

	public void setProd(Product prod) {
		this.prod = prod;
	}
	void displau() {
		System.out.println(prod.getname());
		System.out.println(getMessage());
	}

}
