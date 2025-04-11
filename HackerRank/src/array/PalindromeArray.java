package array;

public class PalindromeArray {
	public static void main(String[] args) {
		int arr[]= {111, 222, 333, 444, 555};
		int sum=0;
		for(int i:arr) {
			while(i!=0) {
				int d=i%10;
				sum=sum*10+d;
				i/=10;
			}
			System.out.println(sum);
			sum=0;
		}
	}
}
