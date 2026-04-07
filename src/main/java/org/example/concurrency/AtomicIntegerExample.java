package org.example.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerExample {


    private AtomicInteger amount = new AtomicInteger();

    private  int nonatomicInt = 0;

    public AtomicIntegerExample(int amount)
    {
        this.amount.set(amount);
        this.nonatomicInt = amount;
    }

    public  int getInitialAmount()
    {
        return this.amount.get();
        //return this.nonatomicInt;
    }
    public int addToAmount( int amount)
    {
        return this.amount.addAndGet(amount);
        //return this.nonatomicInt+=amount;
    }

    public static void main(String[] args) throws InterruptedException {

        AtomicIntegerExample atomicIntegerExample = new AtomicIntegerExample(1000);
        System.out.println("Intial amount = "+  atomicIntegerExample.getInitialAmount());

        Thread[] threads = new Thread[20000];
        for(int i=0;i<20000;i++)
        {
          threads[i] =   new Thread(()->{
                atomicIntegerExample.addToAmount(1);
            });
          threads[i].start();

        }

        for (int i = 0; i < 20000; i++) {
            threads[i].join();
        }
        System.out.println("Thread = "+ Thread.currentThread().getName()+ " Amount ==> " + atomicIntegerExample.getInitialAmount()  );

    }
}
