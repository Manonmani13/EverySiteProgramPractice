package array;

public class IndexOfSubarray {
	public static void main(String[] args) {
		 int arr[] = {1, 2, 3, 7, 5};
	        int target = 12;

	        int start = 0, sum = 0;
	        boolean found = false;

	        for (int end = 0; end < arr.length; end++) {
	            sum += arr[end];

	            while (sum > target && start < end) {
	                sum -= arr[start];
	                start++;
	            }

	            if (sum == target) {
	                // Output 1-based indices
	                System.out.println((start + 1) + " " + (end + 1));
	                found = true;
	                break;
	            }
	        }

	        if (!found) {
	            System.out.println("-1");
	        }
	}

}
