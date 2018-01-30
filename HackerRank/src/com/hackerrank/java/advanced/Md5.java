package com.hackerrank.java.advanced;

import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Given an alphanumeric string, , denoting a password, compute and print its MD5 encryption value.
 */
public class Md5
{
    public static void main(String[] args) {
        try(Scanner s = new Scanner(System.in)) {
           String str = s.next();
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            System.out.println(String.format("%032x", new BigInteger(1, md5.digest(str.getBytes()))));
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Invalid algorithm");
        }

    }
}
