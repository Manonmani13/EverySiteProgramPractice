package array;

public class RemoveElement {
	public static void main(String[] args) {
		int nums[]= {0,1,2,2,3,0,4,2},val=2;
		int count=0;
		for(int n:nums) {
			if(val!=n) {
				count++;
			}
		}
		System.out.println(count);
	}

}
