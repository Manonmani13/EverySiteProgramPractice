package array;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int nums[]= {0,0,1,1,1,2,2,3,3,4};
		int k=remoteDuplicate(nums);
		for(int i=0;i<k;i++) {
			System.out.println(nums[i]);
		}
		System.out.println(k);
		}
		
public static int remoteDuplicate(int[] num) {
	if(num.length==0) {
		return 0;
	}
	int k=1;
	for(int i=1;i<num.length;i++) {
		if(num[i]!=num[i-1]) {
			num[k]=num[i];
			k++;
		}
	}
	return k;
}
}
