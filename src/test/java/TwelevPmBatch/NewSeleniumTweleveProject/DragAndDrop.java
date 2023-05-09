package TwelevPmBatch.NewSeleniumTweleveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable/");

		Thread.sleep(5000);

		Actions a = new Actions(driver);

		WebElement sourceAdd = driver.findElement(By.id("draggable"));
		WebElement destinationAdd = driver.findElement(By.id("droppable"));

		a.clickAndHold(sourceAdd).moveToElement(destinationAdd).release(destinationAdd).perform();

	}

}
