package string;

import java.util.HashSet;

public class TwoCharacter {
	public static void main(String[] args) {
		int n=10;
		String s="beabeefeab";
		System.out.println(alternate(n,s));
	}

	private static int alternate(int n, String s) {
		// TODO Auto-generated method stub
        HashSet<Character> uniqueChars = new HashSet();
        
        for(char c: s.toCharArray()) {
        	uniqueChars.add(c);
        }
        int maxLength=0;
        for(char c1:uniqueChars) {
        	for(char c2: uniqueChars) {
        		if(c1==c2) {
        			continue;
        		}
                StringBuilder filteredString = new StringBuilder();

        		for(char c:s.toCharArray()) {
        			if(c==c1||c==c2) {
        				filteredString.append(c);
        			}
        		}
        		if(isValidAlternativeString(filteredString.toString())) {
        			maxLength=Math.max(maxLength, filteredString.length());
        		}
        	}
        }
		return maxLength;
	}

	private static boolean isValidAlternativeString(String val) {
		// TODO Auto-generated method stub
		for(int i=0;i<val.length();i++) {
			if(val.charAt(i)==val.charAt(i-1)) {
				return false;
			}
		}
		return true;
	}

}
