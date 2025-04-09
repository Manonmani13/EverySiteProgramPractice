package array;

public class TroppingRain {
public static void main(String[] args) {
	 int[] arr1 = {3, 0, 1, 0, 4, 0, 2};
     int[] arr2 = {3, 0, 2, 0, 4};
     int[] arr3 = {1, 2, 3, 4};
     int[] arr4 = {2, 1, 5, 3, 1, 0, 4};

     // Output results
     System.out.println("Water trapped in arr1: " + calculateTrappedWater(arr1));  // Output: 10
     System.out.println("Water trapped in arr2: " + calculateTrappedWater(arr2));  // Output: 7
     System.out.println("Water trapped in arr3: " + calculateTrappedWater(arr3));  // Output: 0
     System.out.println("Water trapped in arr4: " + calculateTrappedWater(arr4));  // Output: 9

}

private static int calculateTrappedWater(int[] arr) {
	// TODO Auto-generated method stub
	int n=arr.length;
	if(n<=2)
		return 0;
	int[] leftMax=new int[n];
	int[] rightMax=new int[n];
	
	leftMax[0]=arr[0];
	rightMax[n-1]=arr[n-1];
	  for (int i = 1; i < n; i++) {
          leftMax[i] = Math.max(leftMax[i - 1], arr[i]);
      }

      // Fill rightMax array
      for (int i = n - 2; i >= 0; i--) {
          rightMax[i] = Math.max(rightMax[i + 1], arr[i]);
      }

      // Calculate the total water trapped
      int totalWater = 0;
      for (int i = 0; i < n; i++) {
          // Water trapped at index i is the min of the max heights on the left and right,
          // minus the height at the current index
          totalWater += Math.max(0, Math.min(leftMax[i], rightMax[i]) - arr[i]);
      }

      return totalWater;
	
}
}
