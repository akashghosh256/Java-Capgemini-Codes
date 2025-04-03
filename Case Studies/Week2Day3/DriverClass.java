package Week2Day3;

import java.util.Scanner;

public class DriverClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of row= ");
		int row=sc.nextInt();
		System.out.println("Enter the number of col= ");
		int column=sc.nextInt();
		int [][] array= new int[row][column];
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				array [i] [j] = sc.nextInt();
			}
		}
		int temp3=method2DArrayMax.maxEle(array, row, column);
		System.out.println("The max elemts is "+temp3);
		sc.close();
	}

}
