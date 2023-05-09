package TwelevPmBatch.NewSeleniumTweleveProject;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	

		driver.get("https://html.com/input-type-file/");
			
		
		WebElement chooseFileBtn = driver.findElement(By.id("fileupload"));
		chooseFileBtn.sendKeys("C:\\Users\\THIS PC\\Desktop\\Commands.txt");
		
		}

}
