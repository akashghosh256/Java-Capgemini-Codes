package CaseStudy9_HW;

public class Employee {
	private String name;
	private int id;
	private double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public void displayInfo() {
		System.out.println("Emp Name: "+this.name);
		System.out.println("Emp ID: "+this.id);
		System.out.println("Emp Salary: "+this.salary);
	}
	

}
