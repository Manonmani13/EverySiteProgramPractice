package com.example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SortingElementInBuild {
    public static void main(String[] args) {
        //approach 1
        int a[]={30,50,40,20,10};
        Arrays.parallelSort(a);
        System.out.println(a);

        //approach 2
         int b[]={30,50,40,20,10};
         Arrays.sort(b);

         //reverse
          Integer a2[]={30,50,40,20,10};
         Arrays.sort(a2,Collections.reverseOrder());
         System.out.println(a2);
    }
}
