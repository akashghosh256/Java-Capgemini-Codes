package Week2Day2;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of terms=");
		int number= sc.nextInt();
		//int sum=0;
		int i=0;
		int term1=0;
		int term2=1;
		while(i<number) {
			int temp=term1+term2;
			term2=temp;
			term2=temp+term2;
			System.out.println(term2);
			i++;
		}
		sc.close();
		
		
		
	}

}
