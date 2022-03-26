package tests;

import org.testng.annotations.Test;

public class GroupAndDependsOnTest {

    @Test(groups = { "Authenticate" })
    public void signIn() {
        System.out.println("Signing in..");
    }


    // @Test(groups = { "Quote" }, dependsOnGroups = "Authenticate")
    @Test(groups = { "Quote" })
    public void createQuote() {
        System.out.println("Creating quote..");
    }

    @Test(groups = { "Policy" }, dependsOnMethods = "createQuote")
    public void createPolicy() {
        System.out.println("Creating policy..");
    }


}
