package CaseStudy7;

public class Student extends Person {
	private int studentID;
	//getter
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID=studentID;
	}
	//constructor
	public Student(String name, int age, int studentID) {
		super(name, age);
		this.studentID = studentID;
	}
	
	public void displayStudentDetails() {
		super.displayPersonDetails();
		System.out.println(this.studentID);
	}

}
