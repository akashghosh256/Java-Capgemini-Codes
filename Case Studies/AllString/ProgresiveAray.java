package AllString;

import java.util.Arrays;

public class ProgresiveAray {
public static void main(String[] args) {
	int s=0;
	int ar[] = {2,5,6,7};
	for(int i=0; i<ar.length;i++) {
		s+=ar[i];
		ar[i]=s;
		
	}
	
	System.out.println(Arrays.toString(ar));
	
}
}
