package Inheritance_UniversittyManagementSystem;

public class University {
	private Person[] persons;
	private static int count =0;
	
	public University(int size) {
		this.persons = new Person[size];
	}
	
	public void addPerson(Person person) {
		if(count<persons.length) {
			persons[count++] = person;
			System.out.println("person added sucessfull");
		}
		else System.out.println("Full");
	}
	
	public void showPeople() {
		for(Person p : persons) {
			if(p instanceof Professor) {
				((Professor)p).displayInfo();
			}
			else if(p instanceof Student) {
				((Student)p).displayInfo();
			}
			else System.out.println("Not a person");
		}
	}

}
