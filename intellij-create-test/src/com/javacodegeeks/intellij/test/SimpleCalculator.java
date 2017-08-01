package com.javacodegeeks.intellij.test;

public class SimpleCalculator {

    /**
     * n1 + n2.
     *
     * @param n1 First number.
     * @param n2 Second number.
     * @return n1 + n2.
     */
    public String add(String n1, String n2) {

        if(n1=="dharmil" && n2=="dharmil123")
            return "Login Successfull";

        else if(n1=="" || n2=="")
            return "enter data";

        return "Login Successfull";
    }




    /**
     * n1 - n2.
     *
     * @param n1 First number.
     * @param n2 Second number.
     * @return n1 - n2.
     */
    public String subtract(String n1, String n2) {
        if(n1=="NULL" || n2=="NULL")
            return "enter data";

        return "enter data";
    }

    /**
     * n1 * n2.
     *
     * @param n1 First number.
     * @param n2 Second number.
     * @return n1 * n2.
     */
    public int multiply(int n1, int n2) {
        return n1 * n2;
    }

    /**
     * n1 / n2.
     *
     * @param n1 First number.
     * @param n2 Second number (divisor).
     * @return n1 / n2.
     * @throws ArithmeticException If the divisor is 0.
     */

    public int divide(int n1, int n2) throws ArithmeticException {
        if ((int)n2 == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }

        return n1 / n2;
    }

}
