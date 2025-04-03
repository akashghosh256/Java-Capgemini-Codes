package CaseStudy9_HW;

public class Department {
    private String deptName;
    private Employee[] employee;
    private int employeeCount;

    public Department(String deptName, int maxEmployees) {
        this.deptName = deptName;
        this.employee = new Employee[maxEmployees]; // Initialize array with max size
        this.employeeCount = 0; // Start with zero employees
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Employee[] getEmployee() {
        return employee;
    }

    public void setEmployee(Employee[] employee) {
        this.employee = employee;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }

    public void addEmployee(Employee emp) {
        if (employeeCount < employee.length) {
            employee[employeeCount] = emp;
            employeeCount++; // Increment count after adding
        } else {
            System.out.println("The Department is full!");
        }
    }

    public void displayEmployees() {
        System.out.println("Employees in the " + deptName + " department:");
        if (employeeCount == 0) {
            System.out.println("No employees available.");
        } else {
            for (int i = 0; i < employeeCount; i++) {
                employee[i].displayInfo(); // Call displayInfo() instead of relying on toString()
            }
        }
    }
}
