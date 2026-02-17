package org.example.data_structure.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySubSequences {

    static void printAllSubsequences ( int index, List<Integer> nums, List<Integer> actualList){
        if(index>=actualList.size())
        {
            System.out.println(nums);
            return;
        }
        nums.add(actualList.get(index));
        printAllSubsequences(index+1,nums,actualList);
        nums.remove(actualList.get(index));
        printAllSubsequences(index+1,nums,actualList);
    }
    public static void main(String args[])
    {
        int[] arr = {3,1,2};
        List<Integer> nums = new ArrayList<>();
        printAllSubsequences(0,nums, Arrays.stream(arr).boxed().toList());

    }
}
