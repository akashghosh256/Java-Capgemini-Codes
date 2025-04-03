package Week2Day3;
public class SumEven {
	public static void main(String[] args) {
		int[][] array={{1,2,3},{2,3,4}};
		int sum=0;
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				if((array[i][j])%2==0) {
					sum+=array[i][j];
					
				}
			}
			
		}
		System.out.println("The sum is : "+sum);
	}

}
