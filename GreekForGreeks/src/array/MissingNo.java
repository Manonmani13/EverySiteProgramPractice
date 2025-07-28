package array;

import java.util.ArrayList;
import java.util.List;

public class MissingNo {
	public static void main(String[] args) {
		int ar[]= {2, -3, 4, 1, 1, 7};
		List<Integer> ls=new ArrayList();
		for(int a:ar) {
			if(a>0) {
				ls.add(a);
			}
		}
		int smallest=1;
		for(int i=1;i<ls.size();i++) {
			if(!ls.contains(smallest)) {
				System.out.println(smallest);
			}
			smallest++;
		}
	}

}
