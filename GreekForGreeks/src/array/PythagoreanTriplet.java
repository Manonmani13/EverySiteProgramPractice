package array;

public class PythagoreanTriplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3, 2, 4, 6, 5};
		int sqr[]=new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			sqr[i]=arr[i]*arr[i];
		}
		for(int i=0;i<sqr.length;i++) {
			System.out.println(sqr[i]);
		}
	}

}
