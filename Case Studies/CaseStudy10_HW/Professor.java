package CaseStudy10_HW;

public class Professor extends Person {
	private String specialization;

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public Professor(String name, int age, String specialization) {
		super(name, age);
		this.specialization = specialization;
	}
	void displayProfessorInfo() {
		super.displayInfo();
		System.out.println("Specialzation: "+this.specialization);
	}
	

}
