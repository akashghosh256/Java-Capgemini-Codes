package CaseStudy2;

public class PalindromicStrings {
	public static int palindromicString(String str) {
		int count = str.length();
		String str2="";
		int flag =0;
		int temp=0;
		for(int i=0; i<str.length()-1;i++) {
			if(str.charAt(i)==str.charAt(i+1)) {
				count+=1;
				flag=1;
				
			}
			
		}
		for(int j = str.length()-1;j>=0;j--) {
			str2 = str2 + str.charAt(j);
			if(str2.equals(str)) {
				temp =1;
				flag=2;
			}
			
		}
		if(flag >0 && flag==2) {
			return count+temp;
			
		
			
		}
		return count;
		
	}
	

}
