package CaseStudy5;

public class Driver {
	public static void main(String[] args) {
		Product p = new Product("Laptop");
		Review r = new Review("Avg", p);
		Review r2 = new Review("gg", p);
		r.displau();
		r2.displau();
	}

}
