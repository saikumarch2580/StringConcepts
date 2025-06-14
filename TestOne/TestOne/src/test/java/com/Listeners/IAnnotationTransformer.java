package com.Listeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.annotations.ITestAnnotation;

public class IAnnotationTransformer implements org.testng.IAnnotationTransformer {

	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		
		annotation.setRetryAnalyzer(com.Listeners.MyRetryAnalyzer.class);
	}
	
	

}
