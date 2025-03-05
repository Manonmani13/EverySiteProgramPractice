package array;

public class EquilibriumPoint {
	public static void main(String[] args) {
		int n[]= {-7, 1, 5, 2, -4, 3, 0};
		System.out.println(findEquilbrium(n));
	}

	private static int findEquilbrium(int[] n) {
		int totalNo=0;
		int leftNo=0;
		for(int i=0;i<n.length;i++) {
			totalNo+=n[i];
		}
		for(int i=0;i<n.length;i++) {
			totalNo-=n[i];
			if(leftNo==totalNo) {
				return i;
			}
			leftNo+=n[i];
		}
		return -1;
	}

}
