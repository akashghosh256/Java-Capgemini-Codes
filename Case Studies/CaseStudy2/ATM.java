package CaseStudy2;

import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Account acc = new Account();
		System.out.println("Welcome to the ATM! " + acc.getAccName() + ".\nHow may we help you!");
		
		while (true) {
			System.out.println("\nChoose an option:\n1. Withdraw Money.\n2. Deposite Money.\n3. Your Balance.\nElse To return.");
			int switchChoice = sc.nextInt();
			switch (switchChoice) {
			case 1:
				
				System.out.println("You choose option 1, so enter the amount to be withdrawn!\n");
				System.out.print("Enter the amount you want to withdraw:= ");
				double withdrawAmount=sc.nextDouble();
				acc.withdrawAcc(withdrawAmount);
				System.out.println("Your new balance is: "+ acc.getBalancer());
				break;
			case 2:{
				System.out.println("You choose option 2, so enter the amount to be deposited.!\n");
				System.out.print("Enter the amount you want to deposite := ");
				double depositeAmount = sc.nextDouble();
				
				acc.depositeAcc(depositeAmount);
			
				System.out.println("Your new balance is: "+ acc.getBalancer());
				break;
				
				
			}
			case 3:{
				System.out.println("Your balance: "+ acc.getBalancer());
				break;
			}
			default: {
				System.out.println("Hey! "+acc.getAccName()+" visit again!");
				sc.close();
				System.exit(0);
			}
			}

		}

	}

}