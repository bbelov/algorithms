package com.hackerrank.java.strings;

import java.util.Scanner;

public class Solution1
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}
class MyRegex {
    //public static final String pattern = "^((\\d{1,2}|1\\d{2}|2[0-4]\\d|25[0-5])\\.){3}(\\d{1,3}|1\\d{2}|2[0-4]\\d|25[0-5])$";
    //public static final String pattern = "^((\\d{1,2}|1\\d{2}|2[0-4]\\d|25[0-5]))$";
    public static final String pattern = "^((0?(\\d{0,2})|1\\d{2}|2[0-4]\\d|25[0-5])\\.){3}(0?(\\d{0,2})|1\\d{2}|2[0-4]\\d|25[0-5])$";
}
