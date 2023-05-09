package TwelevPmBatch.NewSeleniumTweleveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassDropDown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		WebElement createNewAccount = driver
				.findElement(By.cssSelector("a[role='button'][data-testid='open-registration-form-button']"));
		createNewAccount.click();

		Thread.sleep(5000);

		WebElement dateDropDown = driver.findElement(By.id("day"));

		Select s = new Select(dateDropDown);
		s.selectByIndex(10);

		Select s1 = new Select(driver.findElement(By.name("birthday_month")));
		s1.selectByValue("5");

		Select s2 = new Select(driver.findElement(By.xpath("//select[@title='Year']")));
		s2.selectByVisibleText("2001");

	}

}
