package Inheritance_UniversittyManagementSystem;

public class Driver {
public static void main(String[] args) {
	University uni = new University(5);
	Person p = new Student("aaa",24,999);
	uni.addPerson(p);
	Person p1 = new Professor("TTT", 69, "GP");
	uni.addPerson(p1);
	uni.showPeople();
}
}
