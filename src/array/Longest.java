package array;

public class Longest {
	 public int longestSubarray(int[] arr, int k) {
	        // code here
	          HashMap<Integer, Integer> map = new HashMap<>();
	        
	        // Initialize variables
	        int maxLength = 0; // To store the length of the longest subarray
	        int sum = 0; // To keep track of the cumulative sum

	        // Add entry for sum 0 at index -1 (this helps in cases where a subarray starts from index 0)
	        map.put(0, -1);
	        
	        // Traverse the array
	        for (int i = 0; i < arr.length; i++) {
	            // Update the cumulative sum
	            sum += arr[i];
	            
	            // If the cumulative sum minus k is found, update maxLength
	            if (map.containsKey(sum - k)) {
	                maxLength = Math.max(maxLength, i - map.get(sum - k));
	            }
	            
	            // Only store the sum the first time it is encountered
	            if (!map.containsKey(sum)) {
	                map.put(sum, i);
	            }
	        }
	        return maxLength;
	    }
}
