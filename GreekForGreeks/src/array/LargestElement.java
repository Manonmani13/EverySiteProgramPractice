package array;

public class LargestElement {
	public static void main(String[] args) {
		int arr[]= {1, 8, 7, 56, 90};
		int n=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(n<arr[i]) {
				n=arr[i];
			}
		}
		System.out.println(n);
		//Arrays.stream(arr).max().getAsInt();
	}

}
