package CaseStudy7;

public class ArraySumNeg {
	public static void main(String[] args) {
		int [] arr={-1,2,-3,4,-5};
		int count =0;
		for(int i =0;i<arr.length;i++) {
			if(arr[i]<0) {
				count+=1;
			}
			
		}
		int temp=0;
		while(temp<arr.length) {
			for(int i =0;i<arr.length-1;i++) {
				if(arr[i]+arr[i+1]<0) {
					count+=1;
					temp+=1;
					
				}
			}
			
		}
		
		System.out.println(count);
		
	}
	

}
