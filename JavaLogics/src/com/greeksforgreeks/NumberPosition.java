package com.greeksforgreeks;

public class NumberPosition {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5};
	int k=4;
	//Method 1
//	for(int i=0;i<arr.length;i++) {
//		if(k==arr[i]) {
//			System.out.println(i);
//		}
//	}
	int left=0;
	int right=arr.length-1;
	int result=-1;
	
	while(left<=right) {
		int mid=left+(right-left)/2;
		if(arr[mid]==k) {
			result=mid;
			right=mid-1;
		}
		else if(arr[mid]<k) {
			left=mid+1;
		}
		else {
			right=mid+1;
		}
	}
	System.out.println(result);
}
}
