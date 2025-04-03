package Week3Day3;

public class F1Prince extends F1King {
	String nameF1 = "Lewis Hamilton" ;
	F1Prince(String nameF1){
		super("Fernando Alonso");
		this.nameF1=nameF1;
	}
	void display() {
		String nameF1= "Max Verstappen";
		System.out.println(nameF1);
		System.out.println(this.nameF1);
		System.out.println(super.nameF1);
		
	}
	

}
