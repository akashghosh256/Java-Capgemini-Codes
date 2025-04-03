package Week2Day3;

public class method2DArrayMax {
	public static int maxEle(int [] [] arr,int row, int col) {
		int temp=arr[0][0];
		int temp2=0;
		int temp3=0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(arr[i][j]>temp) {
					temp=arr[i][j];
					temp2=i;
					temp3=j;
					
				}
			}
		}
		System.out.println("The max elements if found at"+temp2+","+temp3);
		return temp;
		
	}

}
