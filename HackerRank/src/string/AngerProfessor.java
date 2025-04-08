package string;

public class AngerProfessor {
	public static void main(String[] args) {
		int n[]= {-1 ,-3 ,4 ,2};
		int k=3;
		int onTime=0;
		for(int n1:n) {
			if(n1<=0) {
				onTime++;
			}
		}
		if(onTime>=k) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
	}

}
