package string;

public class IPAddress {
	public static void main(String[] args) {
        System.out.println(isValidIPv4("222.111.111.111")); // true
        System.out.println(isValidIPv4("5555..555"));       // false
        System.out.println(isValidIPv4("0.0.0.255"));   
	}
	public static boolean isValidIPv4(String s) {
		String[] parts=s.split("\\.");
		if(parts.length!=4) {
			return false;
		}
		for(String part:parts) {
			if(part.isEmpty()||!part.matches("\\d+")) {
				return false;
			}
            int num = Integer.parseInt(part);
            
            if (num < 0 || num > 255) {
                return false;
            }
            
            if (part.length() > 1 && part.charAt(0) == '0') {
                return false;
            }		
            }
		return true;
	}
}
