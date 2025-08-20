package array;

public class RotateArray {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5},d=2;
		for(int i=d;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<d;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
