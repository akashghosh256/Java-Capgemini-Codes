package Contstructors;

public class Driver {
	public static void main(String[] args) {
		Employee emp = new Employee("Kanishka",69000,12345678890l);
	//	Employee emp2 = new Employee();
		Employee emp3 = new Employee("Fanishka");
		System.out.println(emp.name);
		System.out.println(emp.salary);
		System.out.println(emp.phoneNumber);
		System.out.println(emp3.name);
		
		
	}

}
