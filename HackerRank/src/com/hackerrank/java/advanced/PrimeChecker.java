package com.hackerrank.java.advanced;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
import static java.lang.System.in;


class Prime {
    public void checkPrime(int... num) {
        for( int i = 0; i < num.length; i++) {
            boolean prime = true;
            for (int j = 2; j < num[i]; j++) {
                if (num[i] % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime && num[i] != 1) {
                System.out.print(num[i] + " ");
            }
        }
        System.out.println();
    }
}


/**
 * You are given a class Solution and its main method in the editor.
 * Your task is to create a class Prime. The class Prime should contain a single method checkPrime.
 * The locked code in the editor will call the checkPrime method with one or more integer arguments.
 * You should write the checkPrime method in such a way that the code prints only the prime numbers.
 * Please read the code given in the editor carefully. Also please do not use method overloading!
 */
public class PrimeChecker
{
    public static void main(String[] args) {
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(in));
            int n1=Integer.parseInt(br.readLine());
            int n2=Integer.parseInt(br.readLine());
            int n3=Integer.parseInt(br.readLine());
            int n4=Integer.parseInt(br.readLine());
            int n5=Integer.parseInt(br.readLine());
            Prime ob=new Prime();
            ob.checkPrime(n1);
            ob.checkPrime(n1,n2);
            ob.checkPrime(n1,n2,n3);
            ob.checkPrime(n1,n2,n3,n4,n5);
            Method[] methods=Prime.class.getDeclaredMethods();
            Set<String> set=new HashSet<>();
            boolean overload=false;
            for(int i=0;i<methods.length;i++)
            {
                if(set.contains(methods[i].getName()))
                {
                    overload=true;
                    break;
                }
                set.add(methods[i].getName());

            }
            if(overload)
            {
                throw new Exception("Overloading not allowed");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
