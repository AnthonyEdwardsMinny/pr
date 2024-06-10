package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class aveda {
	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.aveda.com/");
		//driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		driver.navigate().refresh();
	Actions act=new Actions(driver);
//	WebElement cut	=driver.findElement(By.xpath("//*[name()='svg' and @viewBox='0 0 15 15']"));
//
	WebElement ele=driver.findElement(By.xpath("//div[@id='node-96']/div/ul/li[2]"));	
	//WebElement ele=	driver.findElement(By.xpath("//li[@class='menu__item menu__item--lvl-1 menu__item--category js-menu-item-category active']"));
	act.moveToElement(ele).perform();	

	List<WebElement>elements=driver.findElements(By.xpath("//li[@class='menu__item menu__item--lvl-2 menu__item--category js-menu-item-category active']/div/div/div/div/div/ul/li"));
	Thread.sleep(3000);
//	
for(WebElement eles:elements) {
  	act.moveToElement(eles).perform();
    	System.out.println(eles.getText());
	}

//	
//	
//	
		driver.quit();
		

}
}