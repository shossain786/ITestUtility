package common;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeSuite;

import com.itest.common.CommonUtilities;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class TestBase {

	CommonUtilities utilities = new CommonUtilities();
	
	private static Logger log = Logger.getLogger("TestSetUP");
	
	final static String configPath=System.getProperty("user.dir")+"\\src\\Configuration\\config.properties";
	static String appURL;
	public static ExtentReports extentReport;
	public static ExtentTest test;
	
	static {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat formator = new SimpleDateFormat("dd_MM_YY_hh_mm_SS");
		extentReport = new ExtentReports(System.getProperty("user.dir")+"/src/AutomationTestReport/AutomationTestReport_"+formator.format(calendar.getTime())+".html",false);
	}
	
	@BeforeSuite
	public void testInitializer() {
		log.info("Test Before suite started");
		
	}
}
