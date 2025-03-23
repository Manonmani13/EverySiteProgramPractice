package string;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
	public static void main(String[] args) {
		String s="abcabcbb";
		int maxLength=0;
		int start=0;
		Map<Character,Integer> hm=new HashMap();
		for(int i=0;i<s.length();i++) {
			if(hm.containsKey(s.charAt(i))) {
				hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
				start=Math.max(hm.get(s.charAt(i)), start);
			}
			else {
				hm.put(s.charAt(i), 0);
			}
			maxLength=Math.max(maxLength, start);
		}
		System.out.println(hm.toString()+" "+maxLength);
	}

}
