package Week2Day3;

import java.util.Scanner;

public class MaxEle2DArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of row= ");
		int row=sc.nextInt();
		System.out.println("Enter the number of col= ");
		int column=sc.nextInt();
		int [][] array= new int[row][column];
		int temp=array[0][0];
		int temp2=0;
		int temp3=0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				array [i] [j] = sc.nextInt();
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				if(array[i][j]>temp) {
					temp=array[i][j];
					temp2=i;
					temp3=j;
					
				}
			}
		}
		System.out.println("Max is "+temp);
		System.out.println("Max is found at "+temp2+","+temp3);
		sc.close();
	}

}
