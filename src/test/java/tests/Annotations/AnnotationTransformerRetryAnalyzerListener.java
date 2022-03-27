package tests.Annotations;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class AnnotationTransformerRetryAnalyzerListener implements IAnnotationTransformer {

    // Set retry analysed to retry failed test listener - this helps in not using attribute for every @Test

    @Override
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
        annotation.setRetryAnalyzer(RetryFailedTestListener.class);
    }
}
