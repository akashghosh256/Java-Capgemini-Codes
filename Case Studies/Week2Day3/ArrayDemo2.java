package Week2Day3;

public class ArrayDemo2 {
	public static int ceilM(int target, int [] arr) {
		int start=0;
		int end=arr.length -1;
		while(start<=end) {
			int mid = start+((end-start)/2);
			if(target>arr[mid]) {
				start=mid +1;
			}
			else if(target<arr[mid]) {
				end=mid-1;
			}
			else {
				return mid;
			}
			
		}
		return target;
	}

}
