package Week2Day2;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number=");
		int number= sc.nextInt();
		int cubeSum=0;
		int or=number;
		while(or!=0) {
			int rem=or%10;
			cubeSum+=Math.pow(rem, 3);
			or=or/10;
			
			
		}
		if (number==cubeSum) {
			System.out.println("Amastrng");
		}
		else {
			System.out.println(" Not Amastrng");
		}
		sc.close();
		
			
			
			
		
	}

}
