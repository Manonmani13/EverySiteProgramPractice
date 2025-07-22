package array;

public class IndexOfSumArray {
	public static void main(String[] args) {
		int arr[]= {1,2,3,7,5};
		int target=12;
		int sum=0;
		int start=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			while(sum>target && start<i) {
				sum-=arr[start];
				start++;
			}
			if(sum==target) {
				System.out.println((start+1)+" "+(i+1));
			}
			
		}
	}

}
