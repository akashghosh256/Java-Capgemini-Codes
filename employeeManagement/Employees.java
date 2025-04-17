package employeeManagement;

import java.util.*;


public class Employees {
	
	static ArrayList<Employee> list_of_emp = new ArrayList<Employee>();
	
	public static void addEmployee(Employee emp) {
		list_of_emp.add(emp);
	}
	public static void print() {
//		for(Employee emp : list_of_emp) {
//			System.out.println(emp.toString());
		
	Iterator<Employee> itr = list_of_emp.iterator();
	
	while(itr.hasNext()) {
		Employee emp  = itr.next();	
		System.out.println(emp);  // auto toString 
		
		}
	
	// using list iterator 
	//	ListIterator<Employee> temp_list = list_of_emp.listIterator();
		
	
	}
	
	
	
	public static boolean searchObject(Employee emp) {
		if(list_of_emp.contains(emp))
			return true;
		return false;
	}
	public static boolean searchById(int sid) {
		 for (Employee emp : list_of_emp) {
		        if (emp.equalsId(sid)) {
		            return true;
		        }
		    }
		    return false;
	}
	
	public static boolean removeObject(Employee emp) {
		list_of_emp.remove(emp);
		return true;
	}
	public static boolean deleteById(int sId) {
		
		// for loop -> ConcurrentModificationException
		
		// so use Iterator 
	    Iterator<Employee> itr = list_of_emp.iterator();
	    while (itr.hasNext()) {
	        Employee emp = itr.next();
	        if (emp.equalsId(sId)) {
	            itr.remove(); // ✅ safe removal
	            return true;
	        }
	    }
	    return false;
	}
	
	public static boolean updateById(int sId, Scanner in) {
		Employee old = null;
		for(Employee emp : list_of_emp) {
			if(emp.getId() == sId) {{
				old = emp;
				break;
			}
		}
	}
		if(old!=null) {
			System.out.println("Enter new name,salary");
			old.setName(in.next());
			old.setSalary(in.nextInt());
			return true;
		}
			
			
		
		return false;
}
	
	public static void sort() {
		Collections.sort(list_of_emp,new SortBy());
	}

}
