package Inheritance_UniversittyManagementSystem;

public class Student extends Person {
 private  int studentId;
 public Student(String name, int age, int id){
	 super(name,age);
	 this.studentId = id;
 }
 
 public void displayInfo() {
	 System.out.println("Student is  ");
	 super.displayInfo();
	 System.out.printf("id : %d ",studentId);
	 
 }
 
 
}
