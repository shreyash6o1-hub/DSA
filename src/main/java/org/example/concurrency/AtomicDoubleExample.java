package org.example.concurrency;

import java.util.concurrent.atomic.AtomicReference;

public class AtomicDoubleExample {

    private AtomicReference<Double> amount = new AtomicReference<>(0.0);

    public  double getInitialAmount()
    {
        return this.amount.get();
    }

    public double addAmount(Double amount){
        double updatedAmount = this.amount.updateAndGet(amt -> amt + amount);
        return updatedAmount;
    }

    public static void main(String[] args) throws InterruptedException {
        AtomicDoubleExample atomicDoubleExample = new AtomicDoubleExample();
        atomicDoubleExample.addAmount(1.0);
        System.out.println("Intial amount = "+  atomicDoubleExample.getInitialAmount());
        Thread [] threads = new Thread[20];
        for(int i = 0 ;i< 20;i++)
        {
           threads[ i ] =  new Thread(()->{
                atomicDoubleExample.addAmount( 1.0);
            });
           threads[i].start();
        }

        for(int i=0; i<20;i++)
        {
            threads[i].join();
        }
        System.out.println("Amount After execution of 20000 threads = " + atomicDoubleExample.getInitialAmount());
    }
}
