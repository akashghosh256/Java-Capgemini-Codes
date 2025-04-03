package Week3Day4;

public class Overrides {
	public static void main(String[] args) {
		Parent p =  new Child();
		Child c = (Child) p;
		System.out.println(c.createObj());
		
	}

}
