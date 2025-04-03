package ArrayCapgemini;
import java.util.*;
public class ArrayMethod {
	public static void main(String[] args) {
		int a[]= {1,2,3};
		System.out.println(Arrays.toString(a));
		int a2[]=arrayReturn(a);
		System.out.println(Arrays.toString(a2));
		
		
		
	}
	public static int [] arrayReturn(int [] arr) {
		arr = new int[4];
		arr[0]=9;
		return arr;
	}

}
