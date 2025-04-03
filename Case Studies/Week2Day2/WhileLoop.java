package Week2Day2;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int number= sc.nextInt();
		int  temp=0;
		while(number/10!=0) {
			
			temp+=1;
			number/=10;
		System.out.println(temp);
				
		}
		sc.close();
	}

}
