package com.assignment;
//3. Prime NumberJust like the Perfect number, the Prime number is also a special type of number.
// When the number is divided greater than 1 and divided by 1 or itself is referred to as the Prime number.
// 0 and 1 are not counted as prime numbers.
// All the even numbers can be divided by 2, so 2 is the only even prime minister.
public class PrimeNumber {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int count =0;
        if(a<2){
            System.out.println("Not prime");
        }
        for (int i=2; i<a; i++){
            if (a%i==0){
                count++;
            }
        }if(count>1){
            System.out.println("Not Prime");
        }else {
            System.out.println("Prime");
        }
    }
}




