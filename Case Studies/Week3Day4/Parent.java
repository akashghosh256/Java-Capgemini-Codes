package Week3Day4;

public class Parent {
	Parent createObj() {
		System.out.println("Kahnki baba");
		return new Parent();
	}

}
class Child extends Parent{
//	@Override
//	Parent createObj() {
//		return new Child();
//	}
//	@Override
//	Child createObj() {     //Java 5 Co-variant
//		return new Child();
//	}
	@Override
	Parent createObj() {
		System.out.println("Kahnki chele");
		return new Child();
	}
	
}
