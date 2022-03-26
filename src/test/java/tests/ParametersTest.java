package tests;

import org.testng.annotations.*;

public class ParametersTest {
    @BeforeMethod
    public void before() {
        System.out.println("before..");
    }

    @Test()
    @Parameters({"userName", "password"})
    public void test_dataProvider(String user, String pass) {
        System.out.println("log in as - " + user + " using - " + pass);
    }



    @AfterMethod
    public void after() {
        System.out.println("after..");
    }

}
