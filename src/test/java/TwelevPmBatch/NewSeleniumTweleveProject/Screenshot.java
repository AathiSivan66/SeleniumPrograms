package TwelevPmBatch.NewSeleniumTweleveProject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.goibibo.com/");

		TakesScreenshot tks = (TakesScreenshot) driver;
		File tempFile = tks.getScreenshotAs(OutputType.FILE);

		File permFile = new File(
				"C:\\Users\\THIS PC\\eclipse-workspace\\NewSeleniumTweleveProject\\Screenshots\\proof1.png");

		FileUtils.copyFile(tempFile, permFile);

	}

}
