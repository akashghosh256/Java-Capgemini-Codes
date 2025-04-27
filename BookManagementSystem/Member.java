package BookManagementSystem;

public class Member extends Person{

	public Member(int id, String name) {
		super(id,name);
	}
	
	@Override
	public void showRole() {
		System.out.println("Person is a library Person");
	}
	
	public int getId() {
		 return id;
	}

}
