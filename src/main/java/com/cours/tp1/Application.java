/*
 * Copyright (c) 2018 Theodore SUPIOT
 * <theodore.supiot@gmail.com>
 * Allright reserved
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
    final public static void main(String[] args) {
        System.out.println("Hello World !!");
        final DateTime date = DateTime.now();
        System.out.println(date.toString("dd/MM/YYYY HH:mm"));
    }

    /**
     * Add values and return the result.
     * @param value1 first value.
     * @param value2 second value.
     * @return result of addition
     */
    final public static int add(int value1, int value2) {
        return value1 + value2;
    }

    /**
     * Subtract values and return the result.
     * @param value1 first value
     * @param value2 second value
     * @return result of subtraction
     */
    final public static int subtract(int value1, int value2) {
        return value1 - value2;
    }
}