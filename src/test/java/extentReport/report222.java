package extentReport;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ExtentHtmlReporterConfiguration;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class report222 {
	
	
public static void main(String[] args) {
	// Do this line for testing Stash purposes, adding the sentence in locolly.

	// want to see those uses line dispear after i remove the stash, Github Adding
	
	//Step 1     
	ExtentReports report = new ExtentReports();                    

	
	String localTime  ="_"+ LocalTime.now().toString().substring(0,5).replace(':', '\'');
	
	String path = System.getProperty("user.dir") +  "/test-output/"
			 +LocalDate.now().format(DateTimeFormatter.ofPattern("MM_dd_yyyy")) +"/report"+ localTime+".html";
	//Step 2
	ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(path);
	
	
	//Step 3 ==>  Attach the htmlreport to the report
    report.attachReporter(htmlReporter);
    report.setSystemInfo("Environment", "QA-3");
    report.setSystemInfo("OS", System.getProperty("os.name"));
  //  htmlReporter.config().setAutoCreateRelativePathMedia(true);
   // htmlReporter.config().setProtocol(Protocol.HTTP);
    htmlReporter.config().enableTimeline(false);
    
    // Disable the diagram in the first Page
   // htmlReporter.config().setAutoCreateRelativePathMedia(false);
   // htmlReporter.config().setReportName("ABCDE");
  
    htmlReporter.config().setTheme(Theme.DARK);
    report.setSystemInfo("QA Engineer", "ABCD");
	
	ExtentTest extentLogger  = report.createTest("Policy Center Auto Test case 1 Report");
	// htmlReporter.config().setReportName("ABCDE");
	System.out.println("My frsit step is here");
	extentLogger.info("Step 1");
	
	System.out.println("My secound step is here");
	extentLogger.info("Step 2");
	
	
	System.out.println("My third step is here");
	extentLogger.info("Step 3");
	extentLogger.log(Status.DEBUG, MarkupHelper.createLabel("NosuchElement Exception", ExtentColor.RED));
	extentLogger.assignDevice("abcde");
	extentLogger.info("Step 4");
	try {
		int num = 5/0;
	}
	catch(ArithmeticException e) {
		extentLogger.log(Status.DEBUG, MarkupHelper.createLabel("ArithmeticException Occured", ExtentColor.ORANGE));
		extentLogger.debug(e);
		//e.printStackTrace();
	}
	
	System.out.println("My fourth step is here");
	extentLogger.info("Step 5");
	extentLogger.pass("All Steps are Pass");
	report.flush();
	//Throwable th = new Throwable();
	
//	extentLogger.warning(th); 
//	extentLogger.skip("Tried Skip without Pass");
	//extentLogger.skip("abcde");
	//extentLogger.createNode("abc")
	
	//extentLogger.assignAuthor("Meradel");
//	ExtentTest extentLogger3 =  extentLogger.createNode("Verification");
//	extentLogger3.info("Verifivation Start");
//    extentLogger3.info("Validate User frist name, Pass");
//    extentLogger3.info("Validate User Last name, Pass");
//    extentLogger3.info("Validate User Liseence, Pass");
//    extentLogger3.info("Validate sineor discount, Fail");
//    extentLogger3.info("Validate cooperator employee discount, Fail");
//    extentLogger.info("End of the Report");
	
	
	
	
	ExtentTest extentLogger2  = report.createTest("Verification");
	
	
	// Do verification inside the mode 
	extentLogger2.assignCategory("Verification 1");
	extentLogger2.info(MarkupHelper.createLabel("step 1 is pass", ExtentColor.GREY));
	
	ExtentTest extentLogger4 =  extentLogger2.createNode("Verification 1");
	extentLogger4.log(Status.INFO, MarkupHelper.createLabel("Verifiy the Policy info successfully ", ExtentColor.GREEN));
	extentLogger4.log(Status.INFO, MarkupHelper.createLabel("Verifiy the Policy info fail ", ExtentColor.RED));
	
	extentLogger4.info("Verifivation Start");
    extentLogger4.pass("pass 1");
    extentLogger4.pass("pass 2");
//      extentLogger4.fail("Failed at Step_3");
//    extentLogger4.fail("Fail 1");
//    extentLogger4.fail("Fail 2");
    
    String arr[][] ={
    		{"Mradel","Joseph","Kasun","Yousef"},
    		{"Mradel","Joseph","Kasun",""}
                     };
    
    extentLogger2.assignCategory("Verification 2");
    ExtentTest extentLogger5 =  extentLogger2.createNode("Verification 2");
    extentLogger5.log(Status.INFO, MarkupHelper.createLabel("Verification 2 is fail", ExtentColor.RED));
    extentLogger5.log(Status.INFO, MarkupHelper.createTable(arr));
//	extentLogger5.info("Verifivation 2 Start");
//	extentLogger5.pass("pass 3");
//    extentLogger5.fail("Verification 2 fail");
  
//    extentLogger2.assignDevice("Verify Device");
//	ExtentTest extentLogger6 =  extentLogger2.createNode("Device Test");
//	extentLogger6.info("1234");
    
	
   // Verify in the test Level      
//    extentLogger2.info("Verifivation Start");
//    extentLogger2.pass("pass 1");
//    extentLogger2.pass("pass 2");
//    extentLogger2.pass("pass 3");
//    extentLogger2.fail("Fail 1");
//    extentLogger2.fail("Fail 2");
    
    
//
//	//report.flush();
//	
//	
//	System.out.println("My fifth step is here");
//	extentLogger.info("Step 5");
//	
//	
//	System.out.println("My six step is here");
//	extentLogger.info("Step 6");
//	
//extentLogger.pass("all steps are pass");
//	
//	
//	
	report.flush();
//	extentLogger.pass("all steps are pass");
	//extentLogger.pass("Test past");
		
}
	
	
	
}


