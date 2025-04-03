package CaseStudy2;

public class Account {
	private long accNumber;
	private double balance;
	private String name;

	// getter
	public long getAccNumber() {
		return this.accNumber;

	}

	public double getBalancer() {
		return this.balance;

	}

	public String getAccName() {
		return this.name;

	}

	// setter
	public void setAccName(String name) {
		this.name = name;

	}

	public double setAccBalance(double balance) {

		return this.balance = balance;

	}

	// depositeMethod
	public Account depositeAcc(double amount) {
		if (amount>0) {
			setAccBalance(getBalancer() + amount);
			
		}
		else {
			System.out.println("Invalid amount!");
		}
		return this;
		
		
		

	}

	// withdrawMethod
	public Account withdrawAcc(double amount) {
		
		if (amount>0 && amount<getBalancer()) {
			setAccBalance(getBalancer() - amount);
			
		}
		else {
			System.out.println("Invalid amount!");
		}
		return this;
	}

}