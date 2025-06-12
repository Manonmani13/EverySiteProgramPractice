import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		SelectionSort s=new SelectionSort();
		int a[]= {5,8,11,15,3,2};
		System.out.println(s.selectionSort(a));
		Arrays.stream(a).forEach(p-> System.out.println(p));
	}

	

	public  int[] selectionSort(int a[]) {
		for(int i=0;i<a.length-1;i++) {
			int max=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[max]>a[j])
					max=j;
			}
			int temp=a[max];
			a[max]=a[i];
			a[i]=temp;
		}
		return a;
	}
}
