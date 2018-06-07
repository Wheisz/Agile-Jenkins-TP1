/*
 * Copyright (c) 2018 Theodore SUPIOT
 * <theodore.supiot@gmail.com>
 * Allright reserved
 */

package com.cours.tp1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ApplicationTest {

    @Before
    // S'exécute AVANT chaque test
    public void setup(){
        System.out.println("Before test");
    }

    @After
    // S'exécute APRES chaque test
    public void teardown(){
        System.out.println("After test");
    }

    @Test
    public void testAdd(){
        int i = 2;
        int j = 3;

        // Test case bad
        int result = Application.add(i, j);
        int k = Application.add(i, j);
        Assert.assertEquals("Add not good !", k, Integer.MIN_VALUE);

        // Test case Good
        Application.main(null);
        k = Application.add(i, j);

        Assert.assertEquals("Add not good !", result, 5);
    }

    @Test
    public void testSubtract() {
        int i = 5;
        int j = 3;
        int result = Application.subtract(i, j);
        Assert.assertEquals("Subtract not good !!", result, 2);
    }
}