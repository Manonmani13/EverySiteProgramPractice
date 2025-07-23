package array;

public class FirstNEgativeInWindows {
	public static void main(String[] args) {
		int n[]= {-8, 2, 3, -6, 10};
		int k=2;
		int negative[]=new int[n.length-1];
		
		for(int i=0;i<=n.length-k;i++) {
			boolean found=false;
			for(int j=i;j<i+k;j++) {
				if(n[j]<0) {
					negative[i]=n[j];
					found=true;
//					System.out.println(n[j]);
				}
				if(!found) {
					negative[i]=0;
				}
			}
		}
		for(int neg:negative) {
			System.out.println(neg);
		}
	}

}
