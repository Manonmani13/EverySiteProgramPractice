package string;

public class UncomonCharacter {
	public static void main(String[] args) {
		String s="geeksforgeeks",s2="geeksquiz";
		char arr[]=new char[s.length()+s2.length()];
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s2.length();j++) {
				if(s.charAt(i)==s2.charAt(j)) {
					arr[i]=s.charAt(i);
				}
				
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
