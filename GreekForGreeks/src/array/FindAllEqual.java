package array;

public class FindAllEqual {

	public static void main(String[] args) {
		int k=9;
		int a[]= {1, 2, 4, 5, 7},b[]= {5, 6, 3, 4, 8};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				int sum=a[i]+b[j];
				if(sum==k) {
					System.out.println(a[i]+" "+b[j]);
				}
			}
			
		}
	}
}
