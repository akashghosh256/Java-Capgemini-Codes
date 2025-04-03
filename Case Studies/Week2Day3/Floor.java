package Week2Day3;
import java.util.*;
public class Floor {
	public static void main(String[] args) {
		int [] arr= {1,2,3};
		
		int i =(Arrays.binarySearch(arr, 2));
		System.out.println(i);
		System.out.println(ArrayDemo2.ceilM(i, arr));
	}

}
