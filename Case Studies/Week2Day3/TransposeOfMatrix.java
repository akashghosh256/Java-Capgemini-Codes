package Week2Day3;

public class TransposeOfMatrix {
	public static void main(String[] args) {
		int [] [] array= {{1,2,3},{2,3,4},{6,7,8}};
		int [] [] transpose = new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				transpose[i][j] = array[j][i];
			}
			
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				 System.out.print(transpose[i][j]  + " ");
			}
			System.out.println();
			
		}
	}

}
