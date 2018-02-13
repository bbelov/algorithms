package com.hackerrank.datastructures.stack;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Waiter
{
     static List<Integer> generatePrime(int n) {
         boolean[] prime = new boolean[n+1];
         Arrays.fill(prime, true);
         List<Integer> primes = new ArrayList<>();
         if (n <=2) {
             primes.add(2);
         }
         for(int i = 2; i*i <=n; i++)
         {
             // If prime[p] is not changed, then it is a prime
             if(prime[i])
             {
                 // Update all multiples of p
                 for(int j = i*2; j <= n; j += i) {
                     prime[j] = false;
                 }
             }
         }

         // Print all prime numbers
         for(int i = 2; i <= n; i++)
         {
             if(prime[i]) {
                 primes.add(i);
             }

         }
         return primes;
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            int q = in.nextInt();
            Stack<Integer> ai_1 = new Stack<>();
            for (int i = 0; i < n; ++ i) {
                ai_1.add(in.nextInt());
            }
            // generate all prime number for given q
            List<Integer> primes = generatePrime(q);
            List<Stack<Integer>> stacks = new ArrayList<>(); // stacks of Bs
            Stack<Integer> ai = null;
            for (int p : primes) {
                ai = new Stack<>();
                Stack<Integer> bi = new Stack<>();
                while (ai_1.empty() == false) {
                    int num = ai_1.pop();
                    if (num % p == 0) {
                        bi.add(num);
                    } else {
                        ai.add(num);
                    }
                }
                ai_1 = ai;
                stacks.add(bi);
            }
            // print out B stacks
            for (Stack<Integer> s: stacks) {
                while (s.empty() == false) {
                    System.out.println(s.pop());
                }
            }
            // print out A stack
            while (ai.empty() == false) {
                System.out.println(ai_1.pop());
            }
        }
    }
}
