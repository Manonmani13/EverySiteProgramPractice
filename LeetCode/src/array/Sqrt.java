package array;

public class Sqrt {
	public static void main(String[] args) {
		Sqrt solution = new Sqrt();
	        
	        System.out.println(solution.mySqrt(4));  // Output: 2
	        System.out.println(solution.mySqrt(8));  // Output: 2
	}
	  public int mySqrt(int x) {
	        if (x == 0) {
	            return 0;  
	        }
	        
	        int left = 1, right = x;
	        
	        while (left <= right) {
	            int mid = left + (right - left) / 2;
	            
	            if (mid <= x / mid) {
	                if ((mid + 1) > x / (mid + 1)) {
	                    return mid;  
	                }
	                left = mid + 1;  
	            } else {
	                right = mid - 1;  
	            }
	        }
	        
	        return right;  
	    }

}
