package ArrayCapgemini;

import java.util.Scanner;

public class ArrayDouble {
	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			System.out.println("enter the size of the array=");
			int arraySize=sc.nextInt();
			double [] intArr= new double[arraySize];
			for(int i=0;i<arraySize;i++) {
				intArr[i]=sc.nextDouble();
			}
			for(int i=arraySize-1;i>=0;i--) {
				System.out.println(intArr[i]);
			}
			sc.close();
	}


}
