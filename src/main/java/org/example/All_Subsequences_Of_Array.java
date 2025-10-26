package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class All_Subsequences_Of_Array {

    static void subsequence(List<Integer>nums, List<Integer>actualList, int index){
        if(index>=actualList.size())
        {
            System.out.println(nums);
        }else{
            nums.add(actualList.get(index));
            subsequence(nums,actualList,index+1);
            nums.remove(actualList.get(index));
            subsequence(nums,actualList,index+1);
        }

    }

    public static void main(String args[])
    {
        List<Integer> nums = new ArrayList<>();

       subsequence(nums,Arrays.asList(1,2),0);
    }

}
