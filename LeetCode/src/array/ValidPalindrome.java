package array;

public class ValidPalindrome {
	public static void main(String[] args) {
		String reverse="";
		String s="A man, a plan, a canal: Panama";
		for(int i=s.length()-1;i>=0;i--) {
			if(Character.isLetterOrDigit(s.charAt(i))) {
				reverse+=s.toLowerCase().charAt(i);
			}
		}
		int left=0,right=reverse.length()-1;
		while(left<right) {
			if(reverse.charAt(left)!=reverse.charAt(right)) {
				System.out.println("Not palindrome");
			}
			left++;
			right--;
		}
		System.out.println("Palindrome");
	}

}
