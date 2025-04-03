package Week2Day3;

import java.util.Arrays;
import java.util.Scanner;

public class Demo2DArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of row= ");
		int row=sc.nextInt();
		System.out.println("Enter the number of col= ");
		int column=sc.nextInt();
		double [][] doubleArray2D=new double[row][column];
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				doubleArray2D [i] [j] = sc.nextDouble();
			}
		}
		System.out.println("your array: -");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.print(doubleArray2D [i] [j] + " " );
			}
			System.out.println();
		}
		System.out.println("using For-Each loop!");
		for(double [] a:doubleArray2D) {
			for( double ele:a) {
				System.out.print(ele + " ");
			}
			System.out.println();
		}
		
		System.out.println("using For-Each loop!");
		for(double [] a:doubleArray2D) {
			System.out.println(Arrays.toString(a));
			
		}
		int [][] arr= {{1,2,3},
				{1,2}};
		for(int [] array:arr) {
			System.out.println(Arrays.toString(array));
		}
		
	sc.close();
}

}
