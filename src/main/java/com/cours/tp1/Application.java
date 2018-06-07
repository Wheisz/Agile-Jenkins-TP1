/*
 * Copyright (c) 2018 Theodore SUPIOT
 * <theodore.supiot@gmail.com>
 * Allright reserved
 */

package com.cours.tp1;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

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
    final public static void main(final String[] args) {
        System.out.println("Hello World !!");
        final DateTime date = DateTime.now();
        final String dateString = DateTimeFormat.longDateTime().print(date);
        System.out.println(dateString);
    }

    /**
     * Add values and return the result.
     * @param value1 first value.
     * @param value2 second value.
     * @return result of addition
     */
    final public static int add(final int value1, final int value2) {
        return value1 + value2;
    }

    /**
     * Subtract values and return the result.
     * @param value1 first value
     * @param value2 second value
     * @return result of subtraction
     */
    final public static int subtract(final int value1, final int value2) {
        return value1 - value2;
    }
}