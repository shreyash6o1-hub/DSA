package org.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleTerminalOp {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        // caluclate sum of all elements
        int sum = nums.stream().collect(Collectors.summingInt(a->a.intValue()));
        System.out.println(sum);

        //clauclate aerage of all elements
        double avg = nums.stream().collect(Collectors.averagingInt(a->a.intValue()));
        System.out.println(avg);

        // reduce sum
       int sumRed =  nums.stream().reduce((a,b)->a+b).get();
       System.out.println( "sum reduce " + sumRed);

       // reduce max
        int maxRed = nums.stream().reduce(Integer::max).get();
        System.out.println("maxRed " + maxRed);
    }
}
