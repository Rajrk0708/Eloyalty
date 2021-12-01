package com.cucum.stepdefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cucum.baseclass.BaseClass;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hook extends BaseClass {
	
	@AfterStep
	public void addScreenshot(Scenario scenario) throws IOException {
		TakesScreenshot ss = (TakesScreenshot)driver;
		File screenshot = ss.getScreenshotAs(OutputType.FILE);
		byte[] fileContent = FileUtils.readFileToByteArray(screenshot);
		scenario.attach(fileContent, "image/png", "screenshot");
	}

}
