package tests.Listeners;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listener.class)
public class TestListener {

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Execution of Before method..");
    }

    @Test
    public void listenerTest() {
        System.out.println("Execution of test..");

    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Execution of After method..");
    }

}