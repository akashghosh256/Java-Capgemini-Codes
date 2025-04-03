package AllString;
import java.util.*;

public class Palidrome {
public static void main(String[] args) {
	String s = "hiii";
	char ch = 'i';
	int ct[] = new int[26];
	Arrays.fill(ct, 0);
	int c=0;
	for(char i : s.toCharArray()) {
		ct[i-'a']++;
	}
	for(int i=0;i<26;i++) {
		System.out.println((char)(i+'a')+","+ct[i]);
	}
}
}
