package org.example.data_structure.array;

public class LongestSubArraySumKAllPositives {

    public static int LongestSubArraySumK(int arr[], int k)
    {
        int maxLen = 0 ;
        int left = 0 ;
        int right = 0;
        int sum = arr[left] ;
        while(right < arr.length)
        {
            while(sum>k && left<right)
            {
                sum-=arr[left];
                left++;
            }
            if(sum == k)
            {
             maxLen = Math.max(maxLen, right-left+1);
            }
            right++;
            if(right<arr.length) {
                sum += arr[right];
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,7,5};
        int k = 13;
        int result = LongestSubArraySumK(arr, k);
        if(result > 0)
        {
            System.out.println("The length of the longest subarray with sum " + k + " is: " + result);
        }
    }
}
