package com.assignment;
//1. Fibonacci SeriesFibonacci series is a special type of series in which the next term is the sum of the previous two terms.
// For example, if 0 and 1 are the two previous terms in a series, then the next term will be 1(0+1).
public class FibonacciSeries {
    public static void main(String[] args) {
        int i =0;
        int j =1;
        int k=0;
        System.out.println(i);
        System.out.println(j);
        while (k<50){
            k=i+j;
            System.out.println(k);
            i=j;
            j=k;
        }
    }
}