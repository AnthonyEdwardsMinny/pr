package practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

public class screen {
			@Test
		public void amazontest() throws IOException {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in/");
			
			//step1create an object eventfiringwebdriver
			EventFiringWebDriver edriver= new EventFiringWebDriver(driver);
			//step2 use getscreenshotAs method to get file type of screenshot
			File srcfile=edriver.getScreenshotAs(OutputType.FILE);
			//step3;store screenshot
			FileUtils .copyFile(srcfile, new File("./Ss/test.png"));
			
			
			driver.quit();
		}
		}



