package Inheritance_UniversittyManagementSystem;

public class Professor extends Person{
	private String course;
	
	public Professor(String name, int age, String course) {
		// TODO Auto-generated constructor stub
		super(name,age);
		this.course = course;
	}
	
	public void displayInfo() {
		System.out.println("\n Professor is");
		super.displayInfo();
		System.out.printf("couse: %s \n",course);
	}
}
