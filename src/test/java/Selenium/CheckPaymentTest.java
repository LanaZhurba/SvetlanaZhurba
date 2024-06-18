package Selenium;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;


public class CheckPaymentTest {
    static WebDriver driver;
    static WebDriverWait wait;

    @BeforeAll
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.mts.by/");
        acceptCookies();
    }

//    @Test
//    @DisplayName("Проверка названия блока на сайте")
//    public void testCheckName() {
//        String valueText = driver.findElement(By.xpath("//div[@class='pay__wrapper']/h2")).getText();
//        String expectedText = "Онлайн пополнение\n" + "без комиссии";
//        Assertions.assertEquals(valueText,expectedText,"Текст блока не соответствует фактическому значению");
//    }
//
//    @Test
//    @DisplayName("Проверка логотипов платежных систем")
//    public void testCheckLogo(){
//        Assertions.assertAll("Проверка всех логотипов",
//                () -> Assertions.assertTrue(driver.findElement(By.xpath("//img[@alt='Visa']")).isDisplayed(), "не отображается Visa"),
//                () -> Assertions.assertTrue(driver.findElement(By.xpath("//img[@alt='Verified By Visa']")).isDisplayed(), "не отображается Verified By Visa"),
//                () -> Assertions.assertTrue(driver.findElement(By.xpath("//img[@alt='MasterCard']")).isDisplayed(), "не отображается MasterCard"),
//                () -> Assertions.assertTrue(driver.findElement(By.xpath("//img[@alt='MasterCard Secure Code']")).isDisplayed(), "не отображается MasterCard Secure Code"),
//                () -> Assertions.assertTrue(driver.findElement(By.xpath("//img[@alt='Белкарт']")).isDisplayed(), "не отображается Белкарт")
//        );
//    }
//
//    @Test
//    @DisplayName("Проверка перехода по ссылке")
//    public void testLink(){
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        driver.findElement(By.xpath("//div[@class='pay__wrapper']/a")).click();
//        Assertions.assertTrue(driver.findElement(By.xpath("//span[text()='Порядок оплаты и безопасность интернет платежей']")).isDisplayed(),"нет перехода на другую вкладку");
//        driver.get("https://www.mts.by/");
//    }
//
//    @Test
//    @DisplayName("Заполнение полей и проверка работы кнопок")
//    public void checkInputFormTest() {
//        driver.findElement(By.xpath("//button[@class='select__header']")).click();
//        driver.findElement(By.xpath("//p[text()='Услуги связи']")).click();
//        driver.findElement(By.xpath("//input[@class='phone']")).sendKeys("297777777");
//        driver.findElement(By.xpath("//input[@id='connection-sum']")).sendKeys("100");
//        driver.findElement(By.xpath("//form[@id='pay-connection']/button[@type='submit']")).click();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='bepaid-iframe']")));
//        boolean isDisp = driver.findElement(By.xpath("//*[contains(text(), 'Оплата:')]")).isDisplayed();
//        if (isDisp) {
//            String actual = driver.findElement(By.xpath("//*[contains(text(), 'Оплата:')]")).getText();
//            Assertions.assertEquals(actual, "Оплата: Услуги связи Номер:375297777777", "Не прогрузилось окно оплаты");
//        }
//    }


    private static void acceptCookies() {
        try {
            WebElement cookieButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@class='btn btn_black cookie__ok']")));
            if (cookieButton.isDisplayed()) {
                cookieButton.click();
            }
        } catch (Exception e) {
            System.out.println("Cookie popup not found or clickable");
        }
    }

    @Test
    @DisplayName("Проверка поля Услуги связи")
    public void checkFirstField(){
        driver.findElement(By.xpath("//button[@class='select__header']")).click();
        driver.findElement(By.xpath("//p[text()='Услуги связи']")).click();
        String popupName = driver.findElement(By.xpath("//p[text()='Услуги связи']")).getText();
        Assertions.assertEquals("Услуги связи",popupName);
        Assertions.assertEquals(driver.findElement(By.xpath("//input[@placeholder='Номер телефона']")).getAttribute("placeholder"),"Номер телефона");
        Assertions.assertEquals(driver.findElement(By.xpath("//input[@placeholder='Сумма']")).getAttribute("placeholder"),"Сумма");
        Assertions.assertEquals(driver.findElement(By.xpath("//input[@id='connection-email']")).getAttribute("placeholder"),"E-mail для отправки чека");
    }

    @Test
    @DisplayName("Проверка поля Домашний интернет")
    public void checkSecondField(){
        driver.findElement(By.xpath("//button[@class='select__header']")).click();
        driver.findElement(By.xpath("//p[text()='Домашний интернет']")).click();
        String popupName = driver.findElement(By.xpath("//p[text()='Домашний интернет']")).getText();
        Assertions.assertEquals("Домашний интернет",popupName);
        Assertions.assertEquals(driver.findElement(By.xpath("//input[@placeholder='Номер абонента']")).getAttribute("placeholder"),"Номер абонента");
        Assertions.assertEquals(driver.findElement(By.xpath("//input[@placeholder='Сумма']")).getAttribute("placeholder"),"Сумма");
        Assertions.assertEquals(driver.findElement(By.xpath("//input[@id='connection-email']")).getAttribute("placeholder"),"E-mail для отправки чека");
    }

    @Test
    @DisplayName("Проверка поля Рассрочка")
    public void checkThirdField(){
        driver.findElement(By.xpath("//button[@class='select__header']")).click();
        driver.findElement(By.xpath("//p[text()='Рассрочка']")).click();
        String popupName = driver.findElement(By.xpath("//p[text()='Рассрочка']")).getText();
        Assertions.assertEquals("Рассрочка",popupName);
        Assertions.assertEquals(driver.findElement(By.xpath("//input[@placeholder='Номер счета на 44']")).getAttribute("placeholder"),"Номер счета на 44");
        Assertions.assertEquals(driver.findElement(By.xpath("//input[@placeholder='Сумма']")).getAttribute("placeholder"),"Сумма");
        Assertions.assertEquals(driver.findElement(By.xpath("//input[@id='connection-email']")).getAttribute("placeholder"),"E-mail для отправки чека");
    }

    @Test
    @DisplayName("Проверка поля Задолженность")
    public void checkLastField(){
        driver.findElement(By.xpath("//button[@class='select__header']")).click();
        driver.findElement(By.xpath("//p[text()='Задолженность']")).click();
        String popupName = driver.findElement(By.xpath("//p[text()='Задолженность']")).getText();
        Assertions.assertEquals("Задолженность",popupName);
        Assertions.assertEquals(driver.findElement(By.xpath("//input[@placeholder='Номер счета на 2073']")).getAttribute("placeholder"),"Номер счета на 2073");
        Assertions.assertEquals(driver.findElement(By.xpath("//input[@placeholder='Сумма']")).getAttribute("placeholder"),"Сумма");
        Assertions.assertEquals(driver.findElement(By.xpath("//input[@id='connection-email']")).getAttribute("placeholder"),"E-mail для отправки чека");
    }

    @Test
    @DisplayName("Проверка заполнения полей и отображения логотипов")
    public void checkInputFormText() {
        driver.findElement(By.xpath("//button[@class='select__header']")).click();
        driver.findElement(By.xpath("//p[text()='Услуги связи']")).click();
        driver.findElement(By.xpath("//input[@class='phone']")).sendKeys("297777777");
        driver.findElement(By.xpath("//input[@id='connection-sum']")).sendKeys("100");
        driver.findElement(By.xpath("//input[@id='connection-email']")).sendKeys("see@mail.ru");
        driver.findElement(By.xpath("//form[@id='pay-connection']/button[@type='submit']")).click();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        driver.switchTo().frame(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[@class='bepaid-iframe']"))));
        String sumInButtonText = driver.findElement(By.xpath("//button[@type='submit']")).getAttribute("innerHTML");
        String actualValue = driver.findElement(By.xpath("//*[contains(text(), 'Оплата:')]")).getAttribute("innerHTML");

        Assertions.assertEquals("100.00 BYN",driver.findElement(By.xpath("//div[@class='pay-description__cost']//span[1]")).getAttribute("innerHTML"));
        Assertions.assertEquals(" Оплатить  100.00 BYN <!---->", sumInButtonText);
        Assertions.assertEquals(actualValue, "Оплата: Услуги связи\n" +
                "Номер:375297777777", "Не прогрузилось окно оплаты");
        Assertions.assertEquals("Номер карты", driver.findElement(By.xpath("//label[@class='ng-tns-c46-1 ng-star-inserted']")).getAttribute("innerHTML"));
        Assertions.assertEquals("Срок действия", driver.findElement(By.xpath("//label[@class='ng-tns-c46-4 ng-star-inserted']")).getAttribute("innerHTML"));
        Assertions.assertEquals("Имя держателя (как на карте)", driver.findElement(By.xpath("//label[@class='ng-tns-c46-3 ng-star-inserted']")).getAttribute("innerHTML"));
        Assertions.assertEquals("CVC", driver.findElement(By.xpath("//label[@class='ng-tns-c46-5 ng-star-inserted']")).getAttribute("innerHTML"));
        Assertions.assertTrue(driver.findElement(By.xpath("//img[@src='assets/images/payment-icons/card-types/mastercard-system.svg']")).isDisplayed(), "Иконка MasterCard не отображается");
        Assertions.assertTrue(driver.findElement(By.xpath("//img[@src='assets/images/payment-icons/card-types/visa-system.svg']")).isDisplayed(), "Иконка Visa не отображается");
        Assertions.assertTrue(driver.findElement(By.xpath("//img[@src='assets/images/payment-icons/card-types/belkart-system.svg']")).isDisplayed(), "Иконка Белкард не отображается");
        Assertions.assertTrue(driver.findElement(By.xpath("//div[@class='cards-brands cards-brands_random ng-tns-c61-0 ng-star-inserted']")).isDisplayed(), "Иконка Мир не отображается");
        driver.get("https://www.mts.by/");
    }

    @AfterAll
    public static void closeTest(){
        driver.quit();
    }
}
