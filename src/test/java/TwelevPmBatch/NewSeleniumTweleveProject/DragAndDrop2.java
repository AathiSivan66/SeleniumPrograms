package TwelevPmBatch.NewSeleniumTweleveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

		Thread.sleep(5000);

		Actions a = new Actions(driver);

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));

		a.dragAndDrop(driver.findElement(By.xpath("//h5[text() ='High Tatras']/parent::li")),
				driver.findElement(By.id("trash"))).perform();

	}

}
