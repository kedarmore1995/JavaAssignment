package com.assignment;



//5. Coupon Numbers
// a. Desc -> Given N distinct Coupon Numbers, how many random numbers do you need to generate a distinct coupon number?
// This program simulates this random process.
//b. I/P -> N Distinct Coupon Number
//c. Logic -> repeatedly choose a random number and check whether it's a new one.
//d. O/P -> total random number needed to have all distinct numbers.
//e. Functions => Write Class Static Functions to generate random numbers and to process distinct coupons.

import java.sql.Array;
import java.util.ArrayList;

public class CouponNumbers {

    public static void main(String[] args) {
        int N = 9;
        ArrayList<Integer> arrInt = new ArrayList<>();
        int count=0;
        while (arrInt.size()<N){
            int a =(Math.toIntExact(Math.round(Math.random() * 10)));
            count++;
            if (arrInt.contains(a)) {
                continue;
            }else {
                arrInt.add(a);
            }
        }
        System.out.println("Distinct Array: "+arrInt);
        System.out.println("total random number needed to have all distinct numbers: "+count);
    }
}