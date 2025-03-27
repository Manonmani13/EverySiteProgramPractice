package string;

import java.util.ArrayList;
import java.util.List;

public class PermutationString {
	public static void main(String[] args) {
		String s="ABC";
		List<String> l=new ArrayList();
		permutation(s.toCharArray(),0,l);
		System.out.println(l);
	}

	private static void permutation(char[] charArray, int index, List<String> l) {
		// TODO Auto-generated method stub
		if(index==charArray.length) {
			l.add(new String(charArray));
		}
		for(int i=index;i<charArray.length;i++) {
			swap(charArray,index,i);
			permutation(charArray, index+1, l);
			swap(charArray, index, i);
			
		}
		
	}

	private static void swap(char[] charArray, int index, int i) {
		// TODO Auto-generated method stub
		char temp=charArray[index];
		charArray[index]=charArray[i];
		charArray[i]=temp;
	}

	

}
