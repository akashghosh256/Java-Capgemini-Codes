package string;

public class palindrome {
	public static boolean ispalindrome(String str) {
		int left = 0;
		int right = str.length() - 1;
		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

	public static void main(String[] args) {
		String s = "mom";
		System.out.println(ispalindrome(s));
	}

}
