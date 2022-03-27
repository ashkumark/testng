package tests.Annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class RetryFailedTestListenerExampleTest {

    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("I am in Before Method! Test is starting!");
    }

    @AfterMethod
    public void AfterMethod(){
        System.out.println("I am in After Method! Test is ending!");
    }

    // retryAnalyzer attribute NOT required while running via testng AnnotationTransformer xml
   //@Test(retryAnalyzer = RetryFailedTestListener.class)
    @Test
    public void test1() {
        //Negative Scenario
        System.out.println("Test 1..");
        assertEquals(2+2,5,"Addition Problem! 2+2 must be 4!\n");
    }

    @Test
    public void test2() {
        //Negative Scenario
        System.out.println("Test 2..");
        assertEquals(2+2,3,"Addition Problem! 2+2 must be 4!\n");
    }

    @Test
    public void test3() {
        //Postive Scenario
        System.out.println("Test 3..");
        assertEquals(2+2,4,"Addition Problem! 2+2 must be 4!\n");
    }

}