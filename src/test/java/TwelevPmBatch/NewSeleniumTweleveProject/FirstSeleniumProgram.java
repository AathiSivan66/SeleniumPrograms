package TwelevPmBatch.NewSeleniumTweleveProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class FirstSeleniumProgram {

	public static void main(String[] args) {
		
		
		//ChromeDriver driver = new ChromeDriver();
		//EdgeDriver driver = new EdgeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		//SafariDriver driver = new SafariDriver();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.get("https://www.goindigo.in/");
		driver.get("https://www.goibibo.com/");
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		driver.navigate().to("https://www.agoda.com/");
		
		//driver.close();
		driver.quit();
		
		
		
		
		
		
		
		
		

	}

}
