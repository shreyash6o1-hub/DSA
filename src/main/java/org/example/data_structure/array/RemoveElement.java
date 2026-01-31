package org.example.data_structure.array;

public class RemoveElement {

    public static int removeElement(int [] nums, int val){
        int i = 0;

        for(int j=0;j<nums.length;j++)
        {
            if(nums[j] == val)
            {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args)
    {
        System.out.println(removeElement(new int[]{1,2,2,1,3,1}, 1));
    }
}
