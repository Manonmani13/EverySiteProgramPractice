package string;

public class LongestPalindrome {
public static void main(String[] args) {
	String s="forgeeksskeegfor";
	String longpalindrome="";
	
	for(int i=0;i<s.length();i++) {
		for(int j=i+1;j<=s.length();j++) {
			String palindrome=s.substring(i,j);
			if(isPalindrome(palindrome) && palindrome.length()>longpalindrome.length()) {
				longpalindrome=palindrome;
			}
		}
	}
	System.out.println(longpalindrome);
}
public static boolean isPalindrome(String s) {
	int left=0;
	int right=s.length()-1;
	while(left<right) {
		if(s.charAt(left)!=s.charAt(right)) {
			return false;
		}
		left++;
		right--;
	}
	return true;
}
}
