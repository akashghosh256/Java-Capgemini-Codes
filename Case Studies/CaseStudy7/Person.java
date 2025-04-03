package CaseStudy7;

public class Person {
	private String name;
	private int age;
	
	//constructor
	Person(String name, int age){
		this.age=age;
		this.name=name;
		
	}
	//getter and setter 

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	 public void displayPersonDetails() {
		 System.out.println(this.name);
		 System.out.println(this.age);
	 }
	

}
