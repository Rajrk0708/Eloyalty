package com.cucum.baseclass;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {

	public static WebDriver driver = null;

	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rajrk\\eclipse-workspace\\Selenium\\jar\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public static void proceedWebsite() {
		click(findElementBy(By.id("details-button")));
		implicitlyWait(2, TimeUnit.SECONDS);
		click(findElementBy(By.id("proceed-link")));
	}

	public static void gotoUrl(String url) {
		driver.get(url);
	}

	public static void close() {
		driver.close();
	}

	public static void quit() {
		driver.quit();
	}

	public static void forward() {
		driver.navigate().forward();
	}

	public static void back() {
		driver.navigate().back();
	}

	public static String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

	public static void newloadurl(String url) {
		driver.navigate().to(url);
	}

	public static void refresh() {
		driver.navigate().refresh();
	}

	public static WebElement findElementBy(By ab) {
		return driver.findElement(ab);
	}

	public static List<WebElement> findElementsBy(By ab) {
		return driver.findElements(ab);
	}

	public static void typeData(WebElement element, String data) {
		element.sendKeys(data);
	}

	public static String getText(WebElement element) {
		String text = element.getText();
		return text;
	}

	public static void click(WebElement element) {
		element.click();
	}

	public static String getAttribute(WebElement element, String attribute) {
		return element.getAttribute(attribute);
	}

	public static String getCssValue(WebElement element, String value) {
		return element.getCssValue(value);
	}

	public static void threadSleep(int sec) throws InterruptedException {
		Thread.sleep(sec);
	}

	public static void implicitlyWait(int sec, TimeUnit type) {
		driver.manage().timeouts().implicitlyWait(sec, type);
	}

	public static void explicitlyWait(int sec, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, sec);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void defaultContent() {
		driver.switchTo().defaultContent();
	}

	public static void window(String window) {
		driver.switchTo().window(window);
	}

	public static String getWindowHandle() {
		return driver.getWindowHandle();
	}

	public static Set<String> getWindowHandles() {
		return driver.getWindowHandles();
	}

	public static void switchTab(int index) {
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> li = new ArrayList<String>(windowHandles);
		window(li.get(index));
	}

	public static void goToWindow(Set<String> set, int index) {
		List<String> li = new ArrayList<String>(set);
		window(li.get(index));
	}

	public static void takesScreenShot(String filepath) throws IOException {
		TakesScreenshot ss = (TakesScreenshot) driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File destination = new File(filepath);
		FileUtils.copyFile(source, destination);
	}

	public static String getScreenshot(String screenshotName) throws Exception {
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destination = "./src/test/resources/FailedTestsScreenshots/"+ screenshotName + dateName
				+ ".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		return destination;
	}
	
	@BeforeSuite
	public void beforeSuite() {
		browserLaunch();
		System.out.println("Started");
	}
	
	@AfterSuite
	public void afterSuite() {
		quit();
		System.out.println("Ended");
	}

}
