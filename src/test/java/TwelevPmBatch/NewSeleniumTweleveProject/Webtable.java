package TwelevPmBatch.NewSeleniumTweleveProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		List<WebElement> tableDatas = driver.findElements(By.xpath("//table[@id = 'customers']/tbody/tr"));

		for (WebElement datas : tableDatas) {
			System.out.println(datas.getText() + " ");
		}
		System.out.println("______________________________________________");

		List<WebElement> tHeadings = driver.findElements(By.xpath("//table[@id = 'customers']//th"));

		for (WebElement heading : tHeadings) {
			System.out.println(heading.getText());
		}

		WebElement input = driver.findElement(By.xpath("//table[@id = 'customers']//tr[3]/td[2]"));

		System.out.println(input.getText());
	}

}
