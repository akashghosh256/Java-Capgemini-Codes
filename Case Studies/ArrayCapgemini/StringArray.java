package ArrayCapgemini;

import java.util.Scanner;

public class StringArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String [] name= {"Aman","Laman","Chaman"};
		for(String temp: name) {
			System.out.println(temp);
		}
		sc.close();
	}

}
