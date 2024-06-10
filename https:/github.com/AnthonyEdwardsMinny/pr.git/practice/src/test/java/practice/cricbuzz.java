package practice;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cricbuzz {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get(
				"https://www.cricbuzz.com/live-cricket-scorecard/87542/ned-vs-nep-7th-match-group-d-icc-mens-t20-world-cup-2024");
		List<WebElement> indRuns = driver.findElements(By.xpath(
				"//div[@id='innings_1']/div/child::div[@class='cb-col cb-col-100 cb-scrd-itms']/child::div[@class='cb-col cb-col-8 text-right text-bold']"));

		List<WebElement>playerName=driver.findElements(By.xpath("//div[@id='innings_1']/div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr']/div[@class='cb-col cb-col-100 cb-scrd-itms']/div[@class='cb-col cb-col-25 ']"));
	List<WebElement>Srr= driver.findElements(By.xpath("//div[@id='innings_1']/div/child::div[@class='cb-col cb-col-100 cb-scrd-itms']/child::div[@class='cb-col cb-col-8 text-right text-bold']/following-sibling::div[@class='cb-col text-right cb-col-2']/preceding-sibling::div[1]"));
		int i=0;
		for (WebElement runs : indRuns) {
			int run = Integer.valueOf(runs.getText());
			if (run<=30) {
				System.out.println(playerName.get(i).getText()+"\t"+run+"\t"+Srr.get(i).getText());
		i++;}
		else {
			i++;
		}
			
//		for (WebElement Runs : indRuns) {
//
//			if (Integer.parseInt(Runs.getText()) > 0) {
//
//				String names = driver.findElement(By.xpath(
//						"//div[@id='innings_1']/div/child::div[@class='cb-col cb-col-100 cb-scrd-itms']/child::div[@class='cb-col cb-col-33']/following-sibling::div[@class='cb-col cb-col-8 text-right text-bold'and .='"
//								+ Runs.getText()
//								+ "']/parent::div[@class='cb-col cb-col-100 cb-scrd-itms']/div[@class='cb-col cb-col-25 ']/a"))
//						.getText();
//				String Sr = driver.findElement(By.xpath(
//						" //div[@id='innings_1']/div/child::div[@class='cb-col cb-col-100 cb-scrd-itms']/child::div[@class='cb-col cb-col-33']/following-sibling::div[@class='cb-col cb-col-8 text-right text-bold'and .='"
//								+ Runs.getText()
//								+ "'] /following-sibling::div[@style='padding-right:10px;']/following-sibling::div[@class='cb-col cb-col-8 text-right']"))
//						.getText();
//				System.out.println(names);
//				System.out.println(Runs.getText());
//				System.out.println(Sr);
//
//			}

		}
		driver.quit();

	}
}