package org.example.data_structure.array;

import java.util.ArrayList;
import java.util.List;

public class LeadersInArray {
    //leaders in array defined as all elements to the right
    // are less than current element

     public List<Integer> findLeaders(int [] arr)
     {
         List<Integer>leaders = new ArrayList<>();
         int max = Integer.MIN_VALUE;
         for(int i= arr.length-1 ;i>=0;i--)
         {
             if(arr[i]>max)
             {
                 leaders.add(arr[i]);
                 max = arr[i];
             }

         }return leaders;
     }

    public static void main(String[] args) {
        LeadersInArray leadersInArray = new LeadersInArray();
        int [] arr = {16, 17, 4, 3, 5, 2};
        System.out.println(leadersInArray.findLeaders(arr));
    }
}
