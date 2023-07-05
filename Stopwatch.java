package com.assignment;

//a. Desc -> Write a Stopwatch Program for measuring the time that elapses between
//the start and end clicks
//b. I/P -> Start the Stopwatch and End the Stopwatch
//c. Logic -> Measure the elapsed time between start and end
//d. O/P -> Print the elapsed time.
public class Stopwatch {

    public static void main(String[] args) {
        long start =System.currentTimeMillis();

        for (int i = 0; i <1000000; i++) {
            System.out.println(i);
        }

        long end =System.currentTimeMillis();

        double TimeElapsed=(double) (end-start)/1000;
        System.out.println("Total time elapsed: "+TimeElapsed+ " seconds");
    }
}
