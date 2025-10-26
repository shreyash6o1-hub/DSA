package org.example;

public class StockBuySell {
    static int getMaxProfit(int []arr)
    {
        int maxProfit = 0;
        int balanceAftercell = 0;
        int min = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            min = Math.min(min,arr[i-1]);
            balanceAftercell = arr[i]-min;
            maxProfit = Math.max(balanceAftercell,maxProfit);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        System.out.println(getMaxProfit(new int [] {7,1,0,3,6,4}));
    }
}
