package array;

public class InversionCount {
	public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};

		 int inversion=0;
	        int n=arr.length;
	        
	        for(int i=0;i<n-1;i++){
	            for(int j=i+1;j<n;j++){
	                if(arr[i]>arr[j]){
	                    inversion++;
	                }
	            }
	        }
	        System.out.println(inversion);
	}

}
