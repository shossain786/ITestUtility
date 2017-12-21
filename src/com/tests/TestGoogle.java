package com.tests;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class TestGoogle{
	
	private static Logger log = Logger.getLogger("TestGoogle");

	static{
		log.info("Test Class loaded");
		log.info("---------------------------------->>>>>>>>>>>>>>");
	}
	
	@Test
	public void TC1_Launch_Google() {
		log.info("Google has been successfully loaded.");
	}
}