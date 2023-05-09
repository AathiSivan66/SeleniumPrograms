package TwelevPmBatch.NewSeleniumTweleveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollUpAndDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.amazon.in/");

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,5000)");

		Thread.sleep(3000);

		jse.executeScript("window.scrollBy(0,-5000)");

		Thread.sleep(2000);

		jse.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.xpath("//a[text()='Help']")));

		jse.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.id("nav-logo-sprites")));

	}

}
