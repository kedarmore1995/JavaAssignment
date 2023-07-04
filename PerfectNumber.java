package com.assignment;
//2. Perfect Number
// a. Just like the Armstrong number, the Perfect Number is also a special type of positive number.
// When the number is equal to the sum of its positive divisors excluding the number, it is called a Perfect Number.
// For example, 28 is the perfect number because when we sum the divisors of 28, it will result in the same number.
//The divisors of 28 are 1, 2, 4, 7, and 14. So,
//b. 28 = 1+2+4+7+14
//c. 28 = 28
public class PerfectNumber {
    public static void main(String[] args) {
        //Program to print the perfect numbers

        for (int i = 2; i < 500; i++) {
            int n = 0;
            for (int j = 1; j <= i/2; j++) {
                if (i % j == 0) {
                    n = n + j;
                    }
                }if(n==i){
                System.out.println(i);
            }
        }
    }
}
// This is the program to check if the number is a perfect number:

//        int a =Integer.parseInt(args[0]), SumofDivisors =0;
//        for(int i=1; i<a; i++){
//            if (a%i==0){
//                SumofDivisors = SumofDivisors +i;
//            }
//        }if(a== SumofDivisors){
//            System.out.println(a+" is a perfect number.");
