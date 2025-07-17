package array;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int n[]= {5,9,3,2,1};
		for(int i=0;i<n.length-1;i++) {
			for(int j=0;j<n.length-1-i;j++) {
				if(n[j]>n[j+1]) {
					int temp=n[j];
					n[j]=n[j+1];
					n[j+1]=temp;
				}
				
			}
		}
		Arrays.stream(n).forEach(no->System.out.println(no));
	}

}
