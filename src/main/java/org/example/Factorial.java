package org.example;

import java.math.BigInteger;

public class Factorial {

    public BigInteger calculateF(int number) {
        if (number<0) {
            System.out.println("Число не является натуральным, факториал не вычислить");
            return null;
        } else {
            BigInteger multiplication = new BigInteger("1");
            for (int i = number; i > 0; i--) {
                multiplication = multiplication.multiply(BigInteger.valueOf(i));
            }
            return multiplication;
        }
    }
}
