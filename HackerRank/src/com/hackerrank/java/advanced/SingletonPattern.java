package com.hackerrank.java.advanced;

public class SingletonPattern
{
    private SingletonPattern() {}
    private static SingletonPattern instance = null;

    public static String str;

    public SingletonPattern getSingleInstance() {
        if (instance == null) {
            instance = new SingletonPattern();
        }
        return instance;
    }
}
