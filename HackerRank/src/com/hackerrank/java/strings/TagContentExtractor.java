package com.hackerrank.java.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * - name of start and end tag should be the same
 * - tags can be nested
 * - tag can consist any printable character
 */
public class TagContentExtractor
{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        //Pattern p = Pattern.compile("<\\S+>(\\S+)</\\S+>");
        Pattern p = Pattern.compile("<\\p{Print}+>(.+?)</\\p{Print}+>");
        while(testCases>0){
            String line = in.nextLine();
            Matcher m = p.matcher(line);
            while (m.find()) {
                System.out.println(m.group());
            }
            testCases--;
        }
    }
}
