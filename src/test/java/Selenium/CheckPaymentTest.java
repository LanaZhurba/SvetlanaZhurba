package Selenium;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;


public class CheckPaymentTest {
    static WebDriver driver;


    @BeforeAll
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://www.mts.by/");
        driver.findElement(By.xpath("//button[@id='cookie-agree']")).click();
    }

    @Test
    @DisplayName("Проверка названия блока на сайте")
    public void testCheckName() {
        String valueText = driver.findElement(By.xpath("//div[@class='pay__wrapper']/h2")).getText();
        String expectedText = "Онлайн пополнение\n" + "без комиссии";
        Assertions.assertEquals(valueText,expectedText,"Текст блока не соответствует фактическому значению");
    }

    @Test
    @DisplayName("Проверка логотипов платежных систем")
    public void testCheckLogo(){
        Assertions.assertAll("Проверка всех логотипов",
                () -> Assertions.assertTrue(driver.findElement(By.xpath("//img[@alt='Visa']")).isDisplayed(), "не отображается Visa"),
                () -> Assertions.assertTrue(driver.findElement(By.xpath("//img[@alt='Verified By Visa']")).isDisplayed(), "не отображается Verified By Visa"),
                () -> Assertions.assertTrue(driver.findElement(By.xpath("//img[@alt='MasterCard']")).isDisplayed(), "не отображается MasterCard"),
                () -> Assertions.assertTrue(driver.findElement(By.xpath("//img[@alt='MasterCard Secure Code']")).isDisplayed(), "не отображается MasterCard Secure Code"),
                () -> Assertions.assertTrue(driver.findElement(By.xpath("//img[@alt='Белкарт']")).isDisplayed(), "не отображается Белкарт")
        );
    }

    @Test
    @DisplayName("Проверка перехода по ссылке")
    public void testLink(){
        driver.findElement(By.xpath("//div[@class='pay__wrapper']/a")).click();
        String currentUrl = driver.getCurrentUrl();
        Assertions.assertEquals("https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/", currentUrl);
        driver.findElement(By.xpath("//button[@id='cookie-agree']")).click();
        driver.get("https://www.mts.by/");
        driver.findElement(By.xpath("//button[@id='cookie-agree']")).click();
    }

    @Test
    @DisplayName("Заполнение полей и проверка работы кнопок")
    public void checkInputFormTest() {
        driver.findElement(By.xpath("//button[@class='select__header']")).click();
        driver.findElement(By.xpath("//p[text()='Услуги связи']")).click();
        driver.findElement(By.xpath("//input[@class='phone']")).sendKeys("297777777");
        driver.findElement(By.xpath("//input[@id='connection-sum']")).sendKeys("100");
        driver.findElement(By.xpath("//form[@id='pay-connection']/button[@type='submit']")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='bepaid-iframe']")));
        boolean isDisp = driver.findElement(By.xpath("//*[contains(text(), 'Оплата:')]")).isDisplayed();
        if (isDisp) {
            String actual = driver.findElement(By.xpath("//*[contains(text(), 'Оплата:')]")).getText();
            Assertions.assertEquals(actual, "Оплата: Услуги связи Номер:375297777777", "Не прогрузилось окно оплаты");
        }
    }

    @AfterAll
    public static void closeTest(){
        driver.quit();
    }
}
