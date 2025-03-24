
package array;

public class PalindromeString {
	public static void main(String[] args) {
		String s="abba";
		String reverse="";
		for(int i=s.length()-1;i>=0;i--) {
			reverse+=s.charAt(i);
		}
		boolean check=s.equals(reverse);
		System.out.println(check);
	}

}
