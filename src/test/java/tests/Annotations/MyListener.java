package tests.Annotations;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class MyListener implements IAnnotationTransformer {

    //  override the content of the annotation based on a condition

    int counter = 3;

    @Override
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
       // IAnnotationTransformer.super.transform(annotation, testClass, testConstructor, testMethod);

        if (testMethod.getName().equals("ChangeInvocationCountOfMethod")) {
            System.out.println("Changing invocation for the following method: " + testMethod.getName());
            annotation.setInvocationCount(counter);
        }
    }
}
