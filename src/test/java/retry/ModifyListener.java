package retry;

import java.util.Set;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public class ModifyListener implements ITestListener {

	public void onFinish(ITestContext context) {
		Set<ITestResult> failedTests = context.getFailedTests().getAllResults();
		for (ITestResult temp : failedTests) {
			ITestNGMethod method = temp.getMethod();
			System.out.println("METHOD NAME : "+method.getMethodName());
			if (context.getFailedTests().getResults(method).size() > 1) {
				failedTests.remove(temp);
				System.out.println("METHOD NAME : "+method.getMethodName());
				
			} else {
				if (context.getPassedTests().getResults(method).size() > 0) {
					failedTests.remove(temp);
					
				}
			}
			
			Set<ITestResult> failedTests2 = context.getFailedTests().getAllResults();
			System.out.println("Failed test size is: "+failedTests2.size());
			
			String value=null;
			
			for (ITestResult temp2 : failedTests2) {
				ITestNGMethod method2 = temp2.getMethod();
				value=method2.getMethodName();
				System.out.println("METHOD NAME : "+value);
				
				
			}
		}
		
	}

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}


}
