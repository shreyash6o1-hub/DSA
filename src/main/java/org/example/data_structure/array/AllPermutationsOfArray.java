package org.example.data_structure.array;

import java.util.ArrayList;
import java.util.List;

public class AllPermutationsOfArray {

    static void permute(int index, int [] nums, List<List<Integer>> ans){
        if(index>=nums.length)
        {
           List<Integer> ds = new ArrayList<>();
           for(int i = 0;i<nums.length;i++)
           {
               ds.add(nums[i]);
           }
           ans.add(ds);
           return ;
        }
        for(int i = index; i<nums.length; i++)
        {
            swap(i, index, nums);
            permute(index+1, nums,ans);
            swap(i,index,nums);
        }


    }

    private static void swap(int i, int j, int [] nums){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

    }
    public static void main(String[] args) {
        int nums[] = {1,2,3};
        List<List<Integer>> ans = new ArrayList<>();
        permute(0, nums,ans);
        System.out.println(ans);


    }
}
