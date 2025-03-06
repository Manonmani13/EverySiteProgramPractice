package string;

public class StrongPassword {
	public static void main(String[] args) {
		int n1 = 3;
        String password1 = "Ab1";
        System.out.println(minimumNumber(n1, password1));  // Output: 3

        // Example 2
        int n2 = 11;
        String password2 = "#HackerRank";
        System.out.println(minimumNumber(n2, password2));
	}
	public static int minimumNumber(int n,String password) {
		boolean hasDigit=false;
		boolean hasLower=false;
		boolean hasUpper=false;
		boolean hasSpecial=false;
		
		for(char c:password.toCharArray()) {
			if(Character.isDigit(c)) {
				hasDigit=true;
			}
			else if(Character.isLowerCase(c)) {
				hasLower=true;
			}
			else if(Character.isUpperCase(c)) {
				hasUpper=true;
			}
			else if ("!@#$%^&*()-+".indexOf(c) != -1) {
                hasSpecial = true;
            }
		}
		int missingTypes=0;
		if(!hasDigit) missingTypes++;
		else if(!hasLower) missingTypes++;
		else if(!hasUpper) missingTypes++;
		else if(!hasSpecial) missingTypes++;
		int max=Math.max(0, 6-n);
		return Math.max(missingTypes, max);
	}

}
