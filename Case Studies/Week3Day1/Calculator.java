package Week3Day1;

public class Calculator {
	private double num1;
	private double num2;
	private double result;
	Calculator(double num1, double num2){
		this.num1=num1;
		this.num2=num2;
	}
	//getter 
	public double getNum1() {
		return num1;
	}
	public double getNum2() {
		return num2;
	}
	public double getResult() {
		return result;
	}
	//setter
	public void setnNum1(double num1) {
		this.num1=num1;
	}
	public void setnNum2(double num2) {
		this.num2=num2;
	}
	public void setnResult(double result) {
		this.result=result;
	}
	public static Calculator add(Calculator c) {
		c.setnResult(c.getNum1()+c.getNum2());
		return c;
		
	}
	public static Calculator multiply(Calculator c) {
		c.setnResult(c.getNum1()*c.getNum2());
		return c;
		
	}

}
