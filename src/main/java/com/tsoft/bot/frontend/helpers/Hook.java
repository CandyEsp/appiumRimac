package com.tsoft.bot.frontend.helpers;

import com.tsoft.bot.frontend.listener.Listener;
import com.tsoft.bot.frontend.utility.FileHelper;
import com.tsoft.bot.frontend.utility.GenerateWord;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.internal.TouchAction;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class Hook extends Listener {

//	private static final String URL_MOVISTAR_FIJA   = "http://tdp-web-venta-fija-qa.mybluemix.net/acciones";
//    private static final String CHROME_DRIVER = "/src/main/resources/driver/chromedriver.exe";

	public static AppiumDriver<MobileElement> driver;
	static GenerateWord generateWord = new GenerateWord();

	@Before
	public void Scenario(Scenario scenario){
		onTestStart(scenario.getName());
	}

	@Before
	public void setUpAppium() throws Throwable {
		DesiredCapabilities caps = new DesiredCapabilities();
	    caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME,"Candy");
		caps.setCapability(MobileCapabilityType.UDID, "9505da21");
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 120);
		caps.setCapability(MobileCapabilityType.APP,"C:\\Users\\Candy\\Documents\\Appium\\rimac.apk");
		caps.setCapability("appPackage", "com.rimac.rimac_surrogas.qa");
		caps.setCapability("appActivity", "com.rimac.rimac_surrogas.ui.splash.SplashActivity"); //Mi Movistar



		URL url = new URL("http://localhost:4723/wd/hub/");

		driver = new AppiumDriver<MobileElement>(url, caps);
		//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		generateWord.startUpWord();
	}

	@After
	public void tearDown() throws IOException {
		driver.quit();
		onFinish();
		generateWord.endToWord();
	}

	public static AppiumDriver<MobileElement> getDriver()
	{
		return driver;
	}

}
