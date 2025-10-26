package org.example;

public class MaximunSubArraySum {

    static int maxSubArraySum(int arr[]){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int startIndex = -1;
        int endIndex = -1;
        for(int i= 0 ;i <arr.length;i++)
        {
            if(sum == 0)
            {
                startIndex = i;
            }
            sum += arr[i];

            if(sum > max)
            {
                max = sum;
                endIndex = i;
            }
            if(sum < 0)
            {
                sum=0;
            }
        }
        System.out.println(startIndex+ " " +endIndex);
        for(int j=startIndex; j<=endIndex ;j++)
        {
            System.out.print(arr[j] + " ");
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArraySum(new int[]{-2, -3, 4, -2, -1, 1, 5, -3}));
    }
}
