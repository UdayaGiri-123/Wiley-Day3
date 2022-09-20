package com.threading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class Forkjoinpool {

   public static void main(final String[] arguments) throws InterruptedException, 
      ExecutionException {
      
      int nThreads = Runtime.getRuntime().availableProcessors();
      System.out.println(nThreads);
      
      int[] numbers = new int[10]; 

      for(int i = 0; i < numbers.length; i++) {
         numbers[i] = i;
      }

      ForkJoinPool forkJoinPool = new ForkJoinPool(nThreads);
      Long result = forkJoinPool.invoke(new Sum(numbers,0,numbers.length));
      System.out.println(result);
   }  

   static class Sum extends RecursiveTask<Long> {
      int low;
      int high;
      int[] array;

      Sum(int[] array, int low, int high) {
         this.array = array;
         this.low   = low;
         this.high  = high;
      }

      protected Long compute() {
         
         if(high - low <= 1) {
          return (long)array[low];
         } 
         else {	    	
            int mid = low + (high - low) / 2;
            Sum left  = new Sum(array, low, mid);
            Sum right = new Sum(array, mid, high);
            left.fork();
            long rightResult = right.compute();
            long leftResult  = left.join();
            return leftResult + rightResult;
         }
      }}
   }
