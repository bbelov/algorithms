package com.hackerrank.java.advanced;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Sha256
{
    public static void main(String[] args) {
        try(Scanner s = new Scanner(System.in)) {
            String str = s.next();
            MessageDigest sha256 = MessageDigest.getInstance("SHA-256");
            System.out.println(String.format("%064x", new BigInteger(1, sha256.digest(str.getBytes()))));
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Invalid algorithm");
        }

    }
}
