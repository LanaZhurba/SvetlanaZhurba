package Factorial;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.math.BigInteger;

public class FactorialTest {
    private Factorial number;

   @Test(description = "Проверка валидных данных")
    void checkValidValue(){
        Factorial number = new Factorial();
        Assert.assertEquals(new BigInteger("1"), number.calculateF(0));
        Assert.assertEquals(new BigInteger("1"), number.calculateF(1));
        Assert.assertEquals(new BigInteger("6"), number.calculateF(3));
    }

    @Test(description = "Проверка невалидных данных")
    public void checkNoValidValue(){
        Factorial number = new Factorial();
        Assert.assertNull(number.calculateF(-10));
    }

}
