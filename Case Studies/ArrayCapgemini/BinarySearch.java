package ArrayCapgemini;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[]= {1,2,3,4,6,7,10};
		int end= arr.length -1;
		int start=0;
		int target= sc.nextInt();
		int mid=start + ((end-start)/2);
		while(start<=end) {
			
		}
		if(target==arr[mid]) {
			System.out.println("Element found!");
		}
		else if(target<arr[mid]) {
			end=mid-1;
					
			}
		else if(target>arr[mid]) {
				start=mid+1;
			}
		else{
			System.out.println("Not found!");
				
			}
		sc.close();
			
		}
		
		
	}


