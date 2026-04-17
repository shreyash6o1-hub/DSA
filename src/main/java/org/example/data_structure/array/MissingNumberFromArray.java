package org.example.data_structure.array;

public class MissingNumberFromArray {

    //Given array and N, Array contain 1-N numbers
    // we have to find missing number

    public static int findMissingNumber(int arr[] , int n)
    {
       int sumOfFirstNNumber = (n*(n+1))/2;
        System.out.println(sumOfFirstNNumber);
       int sumOfArray = 0;
       for(int i = 0 ;i < arr.length; i++) {
           sumOfArray += arr[i];
       }
       return sumOfFirstNNumber-sumOfArray;
    }

    public static void main(String[] args) {
        int arr [] = { 1,2,4,5};
        int  n = 5;
        System.out.println(findMissingNumber(arr,n));
    }
}
