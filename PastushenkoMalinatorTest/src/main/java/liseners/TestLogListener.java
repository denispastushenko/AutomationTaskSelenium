package liseners;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.*;

import java.io.File;

public class TestLogListener extends TestListenerAdapter implements IInvokedMethodListener, ISuiteListener {
    private ExtentTest extentTest;
    private ExtentReports extentReports;

    @Override
    public void beforeInvocation(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {
        if (iInvokedMethod.isTestMethod())
            extentTest = extentReports.startTest(iTestResult.getTestName());
    }
    @Override
    public void afterInvocation(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {}

    @Override
    public void onTestFailure(ITestResult tr) {
        extentTest.setDescription(tr.getName());
        extentTest.log(LogStatus.FAIL, tr.getThrowable());
    }

    @Override
    public void onTestSkipped(ITestResult tr) {
        extentTest.setDescription(tr.getName());
        extentTest.log(LogStatus.SKIP, tr.getThrowable());
    }

    @Override
    public void onTestSuccess(ITestResult tr) {
        extentTest.setDescription(tr.getName());
        extentTest.log(LogStatus.PASS, "Test complete Passed");
    }

    @Override
    public void onStart(ISuite iSuite) {
        extentReports = new ExtentReports(System.getProperty("user.dir") + "/testReport/MyTestNgReport.html", true);
        extentReports.addSystemInfo("HostName", "Denys-PC")
                .addSystemInfo("Environment", "QA")
                .addSystemInfo("User Name", "Denys");
        extentReports.loadConfig(new File(System.getProperty("user.dir") + "/extent-config.xml"));
    }

    @Override
    public void onFinish(ISuite iSuite) {
        extentReports.endTest(extentTest);
        extentReports.flush();
    }
}
