package array;

import java.util.HashMap;
import java.util.Map;

public class SubSetARray1 {
	public static void main(String[] args) {
		int[] a = {11, 7, 1, 13, 21, 3, 7, 3};
        int[] b = {11, 3, 7, 1, 7};
        
        Map<Integer,Integer> map=new HashMap();
        
        for(int n: a) {
        	map.put(n,map.getOrDefault(n, 0)+1);
        }
        for(int n:b) {
        	if(!map.containsKey(n)||map.get(n)<=0) {
        		System.out.println(false);
        	}
        	map.put(n, map.get(n)-1);
        }
        System.out.println(true);
	}

}
