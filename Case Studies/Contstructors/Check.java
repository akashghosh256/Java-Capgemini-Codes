package Contstructors;

public class Check {
	int a;
	int b;
	void m1() {
		System.out.println(a);
		System.out.println(b);
	}
	static void m2() {
		Check c= new Check();
		System.out.println(c.b);
		System.out.println(c.a);
	}

}
