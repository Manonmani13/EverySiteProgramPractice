package string;

import java.util.*;

public class Sumof4 {
    public static void main(String[] args) {
        int[] n = {1000000000, 1000000000, 1000000000, 1000000000};
        int target = -294967296;

        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(n);
        int no = n.length;

        for (int i = 0; i < no - 3; i++) {
            for (int j = i + 1; j < no - 2; j++) {
                int left = j + 1, right = no - 1;
                while (left < right) {
                    long sum = (long) n[i] + n[j] + n[left] + n[right];
                    if (sum == target) {
                        result.add(Arrays.asList(n[i], n[j], n[left], n[right]));
                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        System.out.println(new ArrayList<>(result));
    }
}
