package string;

public class StringToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="42".trim();
		if(s.isEmpty()) {
			System.out.println(0);
		}
		int result=0;
		int sign=1;
		int index=0;
		if(s.charAt(index)=='-') {
			sign=-1;
			index++;
		}
		else {
			index++;
		}
		while(index<s.length()) {
			char c=s.charAt(index);
			if(c<'0'&& c>'9') {
				break;
			}
			result*=10+(c-'0');
			index++;
		}
		result*=sign;
		System.out.println(result);
	}

}
