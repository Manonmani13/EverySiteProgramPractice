package array;

public class SearchIndex {

	public static void main(String[] args) {
		int n[]= {1,3,5,6};
		int target=7;
		int left=0,right=n.length-1;
		
		while(left<=right) {
			int mid=(left+right)/2;
			if(n[mid]==target) {
				System.out.println(mid);
			}
			else if(n[mid]<target) {
				left=mid+1;
			}
			else {
				right=mid-1;
			}
		}
		System.out.println(left);
	}
}
