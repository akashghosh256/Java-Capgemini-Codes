package ArrayCapgemini;

import java.util.Scanner;

public class ArrayInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arraySize= sc.nextInt();
		int [] intArr= new int[arraySize];
		for(int i=0;i<=arraySize;i++) {
			intArr[i]=sc.nextInt();
		}
		for(int i=0;i<=arraySize;i++) {
			System.out.println(intArr[i]);
		}
		sc.close();
	
}

}
