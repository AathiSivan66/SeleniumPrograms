package TwelevPmBatch.NewSeleniumTweleveProject;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrapDropDown {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.hdfcbank.com/");
		
		

		//Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Select Product Type']")));

		WebElement firstDrpDown = driver.findElement(By.xpath("//a[text()='Select Product Type']"));

		//Thread.sleep(5000);

		firstDrpDown.click();

		List<WebElement> firstDrpDwnOptions = driver
				.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
		int productsList = firstDrpDwnOptions.size();
		System.out.println("Number of Products : " + productsList);

		for (WebElement options : firstDrpDwnOptions) {
			System.out.println(options.getText());

			if (options.getText().equals("Loans")) {
				options.click();
			}
		}

		driver.findElement(By.xpath("//a[text()= 'Select Product']")).click();

		List<WebElement> secondDrpDwnOptions = driver
				.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']/li"));

		for (int i = 0; i < secondDrpDwnOptions.size(); i++) {
			System.out.println(secondDrpDwnOptions.get(i).getText());

			if (secondDrpDwnOptions.get(i).getText().contains("Salary Plus")) {
				secondDrpDwnOptions.get(i).click();
			}
		}
	}

}
