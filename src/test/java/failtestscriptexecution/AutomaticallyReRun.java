package failtestscriptexecution;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class AutomaticallyReRun implements IAnnotationTransformer {
    public void transfore(ITestAnnotation annotation, Class testClass , Constructor testConstructor , Method testMethod){
        annotation.setRetryAnalyzer(RetryFailScript.class);
    }
}
