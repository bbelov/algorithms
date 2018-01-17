package com.hackerrank.java.strings;

import java.util.Scanner;

/**
 * - user name length between 8 and 30 characters
 * - user name contains only alphanumeric characters([a-z][A-Z][0-9] and underscore ('_')
 * - first character [a-z][A-Z]
 */
public class UserNameRegularExpression
{
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}

class UsernameValidator
{
    public static final String regularExpression ="^[a-zA-Z]\\w{7,29}$";
}
