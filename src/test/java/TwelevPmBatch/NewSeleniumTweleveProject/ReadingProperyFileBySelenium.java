package TwelevPmBatch.NewSeleniumTweleveProject;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class ReadingProperyFileBySelenium {

	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		
		Properties prop = new Properties();

		FileReader fr = new FileReader(
				"C:\\Users\\THIS PC\\eclipse-workspace\\NewSeleniumTweleveProject\\src\\main\\java\\Utilties\\TestData.properties");

		prop.load(fr);

		String broswerName = prop.getProperty("Browser");
		String urlAddress = prop.getProperty("Url");

		if (broswerName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		} else if (broswerName.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		} else {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		}
		
		
		driver.get(urlAddress);

	}

}
