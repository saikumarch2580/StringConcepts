package com.Listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRetryAnalyzer implements IRetryAnalyzer {
     
	int count =0; 
	int Maxreach =4;
	@Override
	public boolean retry(ITestResult result) {
        if (count < Maxreach) {
            count++;
            return true; // Retry the test
        }
        return false; // Don't retry anymore 
		
	}

}
