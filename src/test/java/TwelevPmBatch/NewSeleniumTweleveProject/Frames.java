package TwelevPmBatch.NewSeleniumTweleveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Frames.html");
		Thread.sleep(5000);

		driver.switchTo().frame("singleframe");

		WebElement firstTextBox = driver.findElement(By.cssSelector("input[type='text']"));
		firstTextBox.sendKeys("Twelve AM BATCH selenium ");

		// driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();

		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();

		WebElement outerFrame = driver
				.findElement(By.xpath("//iframe[@style='float: left;height: 300px;width:600px']"));

		driver.switchTo().frame(outerFrame);

		driver.switchTo()
				.frame(driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']")));

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Mission Success");

	}

}
