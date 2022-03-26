package tests.Threads;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebDriverThreadLocalTest {
    /* If you want that a variable should be accessed by the same thread
	 * by which it is created, we can use ThreadLocal variables.*/

    private ThreadLocal<WebDriver> webDriver = new ThreadLocal<>();

    @BeforeMethod
    public void setUp() {
        System.out.println("Open browser");
        WebDriverFactory webDriverFactory = new WebDriverFactory();
        webDriverFactory.setDriver();

        webDriver.set(webDriverFactory.getDriver());
    }

    @Test
    public void testLocalThread_One() {
        System.out.println("Thread id: " + Thread.currentThread().getId());
        webDriver.get().navigate().to("https://www.admiralgroup.co.uk");
    }

    @Test
    public void testLocalThread_Two() {
        System.out.println("Thread id: " + Thread.currentThread().getId());
        webDriver.get().navigate().to("https://www.google.com");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("Close browser");
        webDriver.get().quit();
    }
}
