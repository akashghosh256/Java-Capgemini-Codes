package ArrayCapgemini;

import java.util.Arrays;
public class ArrayClass {
	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5};
		arr= Arrays.copyOf(arr,10);
		System.out.println(Arrays.toString(arr));
		
		int [] arrr2= Arrays.copyOfRange(arr, 2, 5);
		System.out.println(Arrays.toString(arrr2));
		
		System.out.println(Arrays.binarySearch(arrr2, 4));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.binarySearch(arrr2, 4));
		
		
		
		
		
		
	}

}
