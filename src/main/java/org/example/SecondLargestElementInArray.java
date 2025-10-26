package org.example;

public class SecondLargestElementInArray {

    static int getSecondLargest(int[] arr)
    {
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                secondLargest = largest;
                largest = arr[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        System.out.println(getSecondLargest(new int[] {1,45,34,67,980,43}));
    }
}
