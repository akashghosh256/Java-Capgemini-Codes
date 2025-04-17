package employeeManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("welcome");
		while(true) {
		System.out.println(" 1. Add emp \n 2. print all emp \n 3. search emp \n 4. search empl by Id \n 5. delete "
				+ "emp \n 6. Delete emp by ID  \n 7. update emp \n 8. sort by ID");
		
		int    ch = in.nextInt();
		switch(ch) {
		case 1:{
			Employee emp=createEmployeeObject(in);
			Employees.addEmployee(emp);
			///createEmployeeObject(in);
			break;
		}
		case 2:{
			//printAllEmp(Employees.list_of_emp);
			Employees.print();   // this is better 
			break;
		}
		case 3:{
			Employee emp = createEmployeeObject(in);
			System.out.println(Employees.searchObject(emp));
			break;
		}
		case 4:{
			System.out.println("Enter s id");
			int sId = in.nextInt();
			 System.out.println(Employees.searchById(sId));
			 break;
			}
		case 5:{
			Employee emp = createEmployeeObject(in);
			System.out.println(Employees.removeObject(emp));
			break;
		}
		case 6:{
			System.out.println("Enter s id");
			int sId = in.nextInt();
			 System.out.println(Employees.deleteById(sId));
			 break;
		}
		case 7:{
			System.out.println("Enter s id");
			int sId = in.nextInt();
			 System.out.println(Employees.updateById(sId,in));
			 break;
		}
		case 8:{
			Employees.sort();
			Employees.print();   // this is better 
			break;
		}
		
		
		default: System.exit(0);
			
			
		}
		}
}
	
	
	private static Employee createEmployeeObject(Scanner in) {
		Employees.addEmployee(new Employee(234,"aa",666));
		Employees.addEmployee( new Employee(88, "gggg",90000));
		
		System.out.println("Enter id, name,salary");
		Employee emp = new Employee(in.nextInt(), in.next(), in.nextInt());
		
		return emp;
		
		
	}
	
//	private static  void printAllEmp(ArrayList<Employee> list_of_emp) {
//		for(Employee emp : list_of_emp)
//			System.out.println(emp.toString());
//	}
}
