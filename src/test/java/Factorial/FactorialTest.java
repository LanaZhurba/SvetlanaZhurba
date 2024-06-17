package Factorial;

import Factorial.Factorial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.testng.annotations.BeforeTest;

import java.math.BigInteger;

public class FactorialTest {
    private Factorial number;

    @BeforeTest
    public void createFactorial() {
        number = new Factorial();
    }

    @Test
    @DisplayName("Проверка на валидные значения")
    public void validValue() throws MyCheckNaturalException {
        Assertions.assertEquals(new BigInteger("2432902008176640000"), number.calculateF(20));
        Assertions.assertEquals(new BigInteger("1"), number.calculateF(1));
        Assertions.assertEquals(new BigInteger("6"), number.calculateF(3));
        Assertions.assertEquals(new BigInteger("1"), number.calculateF(0));
    }

    @Test
    @DisplayName("Проверка на невалидные значения")
    public void unvalidValue() throws MyCheckNaturalException {
        boolean exceptionCatch = false;
        try {
            number.calculateF(-10);
        } catch (MyCheckNaturalException e) {
            exceptionCatch = true;
        }
        Assertions.assertEquals(false, !exceptionCatch);
    }
}
