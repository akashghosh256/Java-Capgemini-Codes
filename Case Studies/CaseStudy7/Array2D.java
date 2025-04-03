package CaseStudy7;

public class Array2D {
	public static void main(String[] args) {
		
		int [] [] array2d = {{1,1,1},{1,0,1},{1,1,1}};
		int col=array2d[0].length;
		int row=array2d.length;
		int [] [] temp = new int [row] [col];
		
		for(int i =0; i<row;i++) {
			for(int j =0; j<col;j++) {
				temp[i][j]=array2d[i][j];
				
			}
		}
		
		
		for(int i =0; i<row;i++) {
			for(int j =0; j<col;j++) {
				if(temp[i][j]==0) {
					for(int k =0; k<col;k++) {
						temp[i][k]=0;
					}
				
					for(int k =0; k<row;k++) {
						temp[k][j]=0;
					}
					
					
				}
				
			}
			
		}
		
		for(int i =0; i<row;i++) {
			for(int j =0; j<col;j++) {
				array2d[i][j]=temp[i][j];
				
			}
		}
		
		
				
			
		
		for(int i =0; i<row;i++) {
			for(int j =0; j<col;j++) {
				System.out.print(array2d[i][j]);
				
			}
			System.out.println();
			
		}
		
		
	}

}
