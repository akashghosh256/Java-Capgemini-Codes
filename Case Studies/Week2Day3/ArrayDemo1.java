package Week2Day3;
import java.util.*;
public class ArrayDemo1 {
	public static void main(String[] args) {
		int [] arr= {2,3,4,9,12,24,42};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the target");
		int target= sc.nextInt();
		int temp=0;
		double d=0.0;
		ArrayDemo2.ceilM(12,arr);
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==target) {
				temp=i+1;
				break;
				
				
			}
			else if(arr[i]!=target) {
				d=Math.ceil(target);
				temp=i+1;
				break;
				
				
			}
			
		}
		if(temp>0) {
			System.out.println("found");
		}
		else {
			System.out.println("not found");
			
		}
		
		sc.close();
		
		}
	
	}



