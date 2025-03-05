package String;

import java.util.Arrays;

public class Angaram {
	public static void main(String[] args) {
		String s1="geeks", s2="kseeg";
		if(s1.length()!=s2.length()) {
			System.out.println("Not Anagaram");
		}
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		System.out.println(Arrays.equals(c1,c2));
	}

}
