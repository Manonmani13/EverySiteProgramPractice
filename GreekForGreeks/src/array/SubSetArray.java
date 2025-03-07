package array;

public class SubSetArray {
public static void main(String[] args) {
	int a[]= {11, 7, 1, 13, 21, 3, 7, 3}, b[]= {11, 3, 7, 1, 7};
	int no=0;
	for(int n=0;n<a.length;n++) {
		for(int n2=0;n2<b.length; n2++) {
			if(a[n]==b[n2]) {
				System.out.println(a[n]);
				break;
			}
		}
	}
}
}
