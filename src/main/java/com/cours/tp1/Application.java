/*
 * Copyright (c) 2018 Théodore SUPIOT <theodore.supiot@gmail.com> Allright reserved
 */

package com.cours.tp1;

import org.joda.time.DateTime;

/**
 * My main Application.
 * @author Théodore Supiot
 * @version 1.0
 */
public class Application {
    /**
     * Entry point of the application.
     * @param args Argument for CLI.
     */
    public static void main(String[] args) {
        System.out.println("Hello World !!");
        DateTime date = DateTime.now();
        System.out.println(date.toString("dd/MM/YYYY HH:mm"));
    }

    /**
     * Add values and return the result.
     * @param i first value.
     * @param j second value.
     * @return result of addition
     */
    public static int add(int i, int j) {
        return i + j;
    }

    /**
     * Subtract values and return the result.
     * @param i first value
     * @param j second value
     * @return result of subtraction
     */
    public static int subtract(int i, int j) {
        return i - j;
    }
}