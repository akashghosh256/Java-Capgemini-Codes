package Week3Day1;

public class Person {
	private String name;
	private PassPort passport;
	Person(String name, PassPort passport){
		this.name=name;
		this.passport=passport;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public PassPort getPassport() {
		return passport;
	}
	public void setPassport(PassPort passport) {
		this.passport = passport;
	}
	
	

}
