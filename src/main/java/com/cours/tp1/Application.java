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
public final class Application {

    /**
     * Constructor.
     */
    private Application() {
        super();
    }

    /**
     * Entry point of the application.
     * @param args Argument for CLI.
     */
    public static void main(final String[] args) {
        System.out.println("Hello World !!");
        final DateTime date = DateTime.now();
        System.out.println("Application started at : " + date);

        final int value1 = 4;
        final int value2 = 2;

        int result = add(value1, value2);
        System.out.println("Résultat addition : " + result);

        result = subtract(value1, value2);
        System.out.println("Résultat soustraction : " + result);
    }

    /**
     * Add values and return the result.
     * @param value1 first value.
     * @param value2 second value.
     * @return result of addition
     */
    public static int add(final int value1, final int value2) {
        return value1 + value2;
    }

    /**
     * Subtract values and return the result.
     * @param value1 first value
     * @param value2 second value
     * @return result of subtraction
     */
    public static int subtract(final int value1, final int value2) {
        return value1 - value2;
    }
}
