package tests.Annotations;

import org.testng.annotations.Test;

public class IAnnotationTransformerWithExample {

    MyListener obj = new MyListener();

    @Test(invocationCount=5)
    public void changeInvocationCountOfMethod()
    {
        System.out.println("This method has invocation count set to 5 but at run time it shall become " + obj.counter);
    }
}
