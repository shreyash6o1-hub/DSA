package org.example.data_structure.array;

import java.util.HashMap;
import java.util.Map;

public class LogestSubArraySumK {

    public static int longestSubArray(int [] arr , int k)
    {
        int maxLen = 0 ;
        int sum = 0;
        Map<Integer, Integer> sumMap = new HashMap<>();
        for(int i = 0;i<arr.length;i++)
        {
            sum+=arr[i];
            System.out.println("Current sum: " + sum);
            if(sum == k)
            {
                sumMap.put(sum,i);
                maxLen = i+1;
            }
            if(sumMap.containsKey(sum-k))
            {
                maxLen = Math.max(maxLen, i - sumMap.get(sum-k));
            }
            if(!sumMap.containsKey(sum))
            {
                sumMap.put(sum,i);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int [] arr = {1, -1, 5, -2, 3};
        int k = 3;
        //System.out.println(longestSubArray(arr,k)); // Output: 4

        int []arr1 = {-2, -1, 2, 1};
        int k1 = 1;
        System.out.println(longestSubArray(arr1,k1)); // Output: 2
    }
}
