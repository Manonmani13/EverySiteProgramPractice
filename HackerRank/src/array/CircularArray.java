package array;

public class CircularArray {
	public static void main(String[] args) {
		int ar[]= {3,4,5};
		int n[]= {1,2,3};
		int k=2;
		int[] result=new int[n.length];
		for(int i=0;i<n.length;i++) {
			int q=n[i];
			result[i]=ar[(q-k+ar.length)%ar.length];
		}
		for(int n1:result)
		System.out.println(n1);
	}

}
