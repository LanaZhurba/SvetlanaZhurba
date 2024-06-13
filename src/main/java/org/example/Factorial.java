package org.example;

import java.math.BigInteger;

public class Factorial {
    public BigInteger calculateF(int number) throws MyCheckNaturalException {
        if (number < 0) {
            throw new MyCheckNaturalException("Число не является натуральным, нельзя вычислить факториал");
        } else {
            BigInteger multiplication = new BigInteger("1");
            for (int i = number; i > 0; i--) {
                multiplication = multiplication.multiply(BigInteger.valueOf(i));
            }
            return multiplication;
        }
    }
}
