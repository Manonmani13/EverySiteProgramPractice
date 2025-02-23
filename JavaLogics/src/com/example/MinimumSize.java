package com.example;

import java.util.Arrays;

public class MinimumSize {
	 public static int getMinDifference(int k, int[] arr) {
	        int n = arr.length;
	        
	        // If there is only one tower, no operation is needed
	        if (n == 1) {
	            return 0;
	        }

	        // Sort the array to make it easier to handle the difference
	        Arrays.sort(arr);
	        
	        // Initial difference between the largest and smallest heights
	        int diff = arr[n - 1] - arr[0];
	        
	        // Check every possible combination by modifying the smallest and largest values
	        int newMin = arr[0] + k;
	        int newMax = arr[n - 1] - k;
	        
	        // Loop through the array and compute the difference after the operations
	        for (int i = 1; i < n - 1; i++) {
	            int add = arr[i] + k;
	            int sub = arr[i] - k;
	            
	            // Update the smallest or largest values depending on which gives the minimal result
	            int currMin = Math.min(newMin, sub);
	            int currMax = Math.max(newMax, add);
	            
	            diff = Math.min(diff, currMax - currMin);
	        }

	        return diff;
	    }

	    public static void main(String[] args) {
	        // Test cases
	        int k1 = 2;
	        int[] arr1 = {1, 5, 8, 10};
	        System.out.println(getMinDifference(k1, arr1)); // Output: 5

	        int k2 = 3;
	        int[] arr2 = {3, 9, 12, 16, 20};
	        System.out.println(getMinDifference(k2, arr2)); // Output: 11
	    }
}
