package Week3Day1;

public class Driver {
	public static void main(String[] args) {
		Calculator c = new Calculator(23.23, 46.46);
		Calculator.add(c).multiply(c);
		System.out.println(c.getResult());
	}

}
