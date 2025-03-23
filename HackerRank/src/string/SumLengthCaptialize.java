package string;

public class SumLengthCaptialize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="hello";
		String b="java";
		int length=a.length()+b.length();
		System.out.println(a.compareTo(b) > 0);
        String cap = a.compareTo(b) > 0? "Yes" : "No";

		String capi=a.substring(0,1).toUpperCase()+a.substring(1).toLowerCase()+" "+b.substring(0,1).toUpperCase()+b.substring(1).toLowerCase();
		System.out.println(length);
		System.out.println(cap);
		System.out.println(capi);
	}

}
