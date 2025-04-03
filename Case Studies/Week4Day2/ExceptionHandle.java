package Week4Day2;

public class ExceptionHandle {
	public static void main(String[] args) {
		try {
			System.out.println(0/0);
		}
		catch(Exception e)
		{
			System.out.println("Pakar Liya Bc! phle sikh ki: "+e.getMessage()+",kya hota haa!");
			
		}
		System.out.println();
	}

}
