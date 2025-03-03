package array;

import java.util.Arrays;

public class MinimumOfEffect {
	public static void main(String[] args) {
		int k1=2;
        int[] arr1 = {1, 5, 8, 10};
        int n=arr1.length;
        Arrays.sort(arr1);
        int result=arr1[n-1]-arr1[0];
        for(int i=1;i<n;i++) {
        	int newMax=Math.max(arr1[n-1]-k1, arr1[i-1]+k1);
        	int newMin=Math.min(arr1[0]+k1, arr1[i]-k1);
        	result=Math.min(result,newMax-newMin);
        	
        }
        System.out.println(result);
	}

}
