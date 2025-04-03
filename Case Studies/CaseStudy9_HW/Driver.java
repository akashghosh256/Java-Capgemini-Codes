package CaseStudy9_HW;
public class Driver {
	    public static void main(String[] args) {
	        Department dep = new Department("IT", 3);
	        Employee emp1 = new Employee("Alice", 101, 50000);
	        Employee emp2 = new Employee("Bob", 102, 60000);
	        Employee emp3 = new Employee("Charlie", 103, 70000);
	        Employee emp4 = new Employee("David", 104, 80000); 
	        dep.addEmployee(emp1);
	        dep.addEmployee(emp2);
	        dep.addEmployee(emp3);
	        dep.addEmployee(emp4); 
	        dep.displayEmployees();
	    }
	}


