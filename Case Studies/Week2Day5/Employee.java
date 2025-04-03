package Week2Day5;

public class Employee {
	public String getname() {
		return this.name;
	}
	public void setgetname(String name) {
		this.name=name;
		System.out.println(name);
	}
	private String name="Kanishka";
	private int age=90;
	private long phoneNumber=9090909090l;
	private double salery=20000;
	public static void main(String[] args) {
		Employee e= new Employee();
		System.out.println(e.age);
		System.out.println(e.name);
		System.out.println(e.phoneNumber);
		System.out.println(e.salery);
		
	}

}
