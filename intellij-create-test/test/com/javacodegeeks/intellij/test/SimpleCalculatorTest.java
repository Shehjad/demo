package com.javacodegeeks.intellij.test;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by julen on 8/26/16.
 */
public class SimpleCalculatorTest {
    int n2;

    SimpleCalculator s ;
    @Before
    public void setUp() throws Exception {
        this.s = new SimpleCalculator();
    }

    @Test
    public void add() throws Exception {
        String user ="dharmil";
        String pass ="dharmil123";
        String excpected ="Login Successfull";

        String actual;
        actual = this.s.add(user,pass);
        assertEquals(actual,excpected);

    }

    @Test
    public void subtract() throws Exception {
        String user ="NULL";
        String pass ="NULL";

        String excpected2 ="enter data";
        String actual;
        actual = this.s.subtract(user,pass);

        assertEquals(actual,excpected2);
    }

    @Test
    public void multiply() throws Exception {
        int n1 =1;
        int n2 = 3;
        int excpected = 3;
        int actual;
        actual = this.s.multiply(n1,n2);
        assertEquals(actual,excpected);
    }

    @Test
    public void divide() throws Exception {
        int n1 =4;
        int n2 = 2;
        int excpected = 2;
        int actual;
        actual = this.s.divide(n1,n2);
        assertEquals(actual,excpected);
    }

}