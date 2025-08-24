package array;

public class Rotated {
	public static void main(String[] args) {
		String s1 = "abcd", s2 = "cdab";
		System.out.println(s1.length() ==s2.length() && (s1+s2).contains(s1));
	}

}
