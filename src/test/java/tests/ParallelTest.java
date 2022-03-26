package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * *********************************
 * parallel=?methods?: TestNG will run all the test methods (@Test annotated methods) across the suite in separate threads.
 * Dependent methods will also run in separate threads but they will respect the order that you specified.
 * @author ash
 **********************************
 */
public class ParallelTest {

    @BeforeMethod
    public void before() {
        System.out.println("before..");
    }

    @Test(groups = { "Quote" })
    public void createQuote() {
        System.out.println("Creating quote..");
        System.out.println("Thread id for quote: " + Thread.currentThread().getId());
    }

    @Test(groups = { "Policy" })
    public void createPolicy() {
        System.out.println("Creating policy..");
        System.out.println("Thread id for policy: " + Thread.currentThread().getId());
    }

    @AfterMethod
    public void after() {
        System.out.println("after..");
    }

}
