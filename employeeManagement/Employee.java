package employeeManagement;


public class Employee  implements Comparable<Employee> {
private int id;

private String name;
private double salary;

public Employee(int id, String name, double salary) {
	
	this.id = id;
	this.name = name;
	this.salary = salary;
}


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}


@Override
public String toString() {
    return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}

@Override
public boolean equals(Object obj) {
    if (this == obj) return true; // same reference
    if (obj == null || getClass() != obj.getClass()) return false; // null or different class
    
    Employee other = (Employee) obj; // safe cast
    return id == other.id &&
            name.equals(other.name) &&
            Double.compare(salary, other.salary) == 0;}
public boolean equalsId(int  sId) {

    return this.id == sId; 
}

@Override
public int compareTo(Employee o) {
    //return Integer.compare(this.id, o.id);
	return this.id-o.id;
}
}

