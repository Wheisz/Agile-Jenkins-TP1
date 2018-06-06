package com.cours.tp1;

import org.joda.time.DateTime;

public class Application {
    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello World !!");

        DateTime date = DateTime.now();
        System.out.println(date.toString("dd/MM/YYYY HH:mm"));
    }

    public static int add(int i, int j) {
        return i + j;
    }

    public static int subtract(int i, int j) {
        return i - j;
    }
}
