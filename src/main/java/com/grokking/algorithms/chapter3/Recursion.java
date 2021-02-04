package com.grokking.algorithms.chapter3;

/**
 * Recursive method definition
 * Method calls itself
 * 1. base case
 * 2. recursive case
 * <p>
 * Call Stack
 *
 * tail recursion needs an acumulator
 */
public class Recursion {

    public static void countDown(int n) {
        System.out.println(n);
        if (n <= 0) { // base case
            return;
        } else {
            countDown(--n);
        }
    }

    // normal recursion
    public static long factorial(long x) {
        if (x == 1) {
            return 1;
        } else {
            return x * factorial(x - 1);
        }
    }

    //tail recursion
    public  static long fact(long n, long a) {
        if(n == 0){
            return a;
        }
        return fact(n-1, a*n);
    }

    public static void main(String[] args) {

        System.out.println(factorial(65));

        System.out.println(fact(65,1));
    }
}