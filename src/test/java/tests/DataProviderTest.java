package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Iterator;

public class DataProviderTest {

    @BeforeMethod
    public void before() {
        System.out.println("before..");
    }

    @Test(dataProvider = "auth")
    public void test_dataProvider(String user, String pass) {
        System.out.println("log in as - " + user + " using - " + pass);
    }

    @DataProvider
    public Object[][] auth() {
        return new Object[][] {
                {"ash", "pass"},
                {"test", "pass1"}
        };
    }

    @AfterMethod
    public void after() {
        System.out.println("after..");
    }

}
