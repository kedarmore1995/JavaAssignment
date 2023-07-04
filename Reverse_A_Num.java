package com.assignment;
//4. Reverse a numberIn Java, we can reverse a number either by using for loop, while loop, or using recursion.
// The simplest way to reverse a number is by using for loop or while loop. In order to reverse a number,
//  we have to follow the following steps:
//a. We need to calculate the remainder of the number using the modulo
//b. After that, we need to multiply the variable reverse by 10 and add the remainder into it.
//c. We then divide the number by 10 and repeat steps until the number becomes 0.
public class Reverse_A_Num {
    public static void main(String[] args) {
        int num =12345;
        int reverse=0;
        while (num!=0) {
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num= num / 10;
        }
        System.out.println(reverse);
    }
}
