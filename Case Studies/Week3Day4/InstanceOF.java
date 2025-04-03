package Week3Day4;

public class InstanceOF {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a instanceof A);
		System.out.println(a instanceof B);
		System.out.println(a instanceof C);
		System.out.println(a instanceof D);
//		System.out.println(a instanceof E); CTE
		System.out.println();
		C c = new C();
		System.out.println(c instanceof A);
//		System.out.println(c instanceof B);CTE
		System.out.println(c instanceof C);
		System.out.println(c instanceof D);
//		System.out.println(a instanceof E); CTE
		System.out.println();
		B b = new B();
		System.out.println(b instanceof A);
		System.out.println(b instanceof B);
//		System.out.println(b instanceof C);CTE
//		System.out.println(b instanceof D);CTE
//		System.out.println(b instanceof E); CTE
		System.out.println();
		D d = new D();
		System.out.println(d instanceof A);
//		System.out.println(d instanceof B);
		System.out.println(d instanceof C);
		System.out.println(d instanceof D);
//		System.out.println(d instanceof E); CTE
		
		A aa = new C();
		System.out.println(aa instanceof A);
		System.out.println(aa instanceof B);
		System.out.println(aa instanceof C);
		System.out.println(aa instanceof D);
//		System.out.println(a instanceof E); CTE
		System.out.println();
		C cc = new D();
		System.out.println(cc instanceof A);
//		System.out.println(cc instanceof B);
		System.out.println(cc instanceof C);
		System.out.println(cc instanceof D);
//		System.out.println(a instanceof E); CTE
		System.out.println();
	
		D dd = new D();
		System.out.println(dd instanceof A);
//		System.out.println(dd instanceof B);
		System.out.println(dd instanceof C);
		System.out.println(dd instanceof D);
//		System.out.println(d instanceof E); CTE
		
				
	}

}
class A{}
class B extends A{}
class  C extends A{}
class D  extends C{}
class E{}

