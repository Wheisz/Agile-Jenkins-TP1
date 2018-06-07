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
        int i = 2, j = 3, result;
        result = Application.add(i, j);
        Assert.assertEquals("Add not good !", result, 5);
    }

    @Test
    public void testSubtract() {
        int i = 5, j = 3, result;
        result = Application.subtract(i, j);
        Assert.assertEquals("Subtract not good !!", result, 2);
    }
}