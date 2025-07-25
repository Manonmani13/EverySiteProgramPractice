package array;

public class FirstUniqueCharacter {

	public static void main(String[] args) {
		String s="leetcode";
		int index=-1;
		for(int i=0;i<s.length();i++) {
			boolean isUnique=true;

			for(int j=i+1;j<s.length();j++) {
				if (i != j && s.charAt(i) == s.charAt(j)) {
                    isUnique = false;
                    break;
                }

			}
			if (isUnique) {
                index = i;
                break; // Found the first unique character
            }
		}
	}
}
