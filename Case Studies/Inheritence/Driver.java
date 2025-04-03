package Inheritence;

public class Driver {
	public static void main(String[] args) {
		Animal a = new Animal();
		Dog d = new Dog();
		System.out.println(d.a);
		System.out.println(a.a);
		d.janwr();
		d.kutta();
		d.nongraJanwar();
		d.nongraKutta();
	}

}
