package Contstructors;

public class Employee {
	String name;
	double salary;
	long phoneNumber;

	Employee() {
		System.out.println("Gorib er bacha!");

	}

	Employee(String name) {
		this.name = name;

	}

	Employee(String name, double salary) {
		this(name);
		this.salary = salary;

	}

	Employee(String name, double salary, long phoneNumber) {
		this(name, salary);
		this.phoneNumber = phoneNumber;
	}

}
