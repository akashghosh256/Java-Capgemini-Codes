package CaseStudy10_HW;

public class Student extends Person{
	private int studentID;

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public Student(String name, int age, int studentID) {
		super(name, age);
		this.studentID = studentID;
	}
	
	void displayStudentInfo() {
		super.displayInfo();
		System.out.println("Student ID: "+this.studentID);
	}

}
