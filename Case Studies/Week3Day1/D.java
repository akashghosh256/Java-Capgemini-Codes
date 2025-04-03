package Week3Day1;

public class D {
	public static void main(String[] args) {
		PassPort passport = new PassPort("123454");
		Person person = new Person("Kanihka", passport);
		System.out.println(passport.getPassport());
		System.out.println(person.getName());
		
		
	}

}
