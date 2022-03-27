package tests.Annotations;

import org.testng.IRetryAnalyzer;
import org.testng.ISuiteListener;
import org.testng.ITestResult;

public class RetryFailedTestListener implements IRetryAnalyzer {

    // Retry failed test in TestNG using IRetryAnalyzer

    private int count = 0;
    private int maxTries = 3;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if (!iTestResult.isSuccess()) { //Check if test not succeed
            System.out.println("Test Result - " + iTestResult.getStatus() + " Retry attempt - " + (count+1));
            if (count < maxTries) {                            //Check if maxtry count is reached
                count++;                                     //Increase the maxTry count by 1
                iTestResult.setStatus(ITestResult.FAILURE);  //Mark test as failed
                return true;                                 //Tells TestNG to re-run the test
            } else {
                iTestResult.setStatus(ITestResult.FAILURE);  //If maxCount reached,test marked as failed
            }
        } else {
            iTestResult.setStatus(ITestResult.SUCCESS);      //If test passes, TestNG marks it as passed
        }
        return false;
    }





}
