package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xpath {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.youtube.com/");
	driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("pasoori");
	driver.findElement(By.xpath("//input[@name='search_query']/../../../following-sibling::button")).click();
	//driver.quit();
}
}
