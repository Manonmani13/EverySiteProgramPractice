package string;

public class UtopicTree {
	public static void main(String[] args) {
		int arr[]= {3,0,1,4};
		for(int c=0;c<arr.length;c++) {
			System.out.println(utopianTree(arr[c]));
		}
	}
	public static int utopianTree(int n) {
        int height = 1;  // Initial height is 1 meter
        for (int cycle = 1; cycle <= n; cycle++) {
            if (cycle % 2 != 0) {  // Odd cycle (Spring) -> double the height
                height *= 2;
            } else {  // Even cycle (Summer) -> add 1 meter
                height += 1;
            }
        }
        return height;
    }
}
