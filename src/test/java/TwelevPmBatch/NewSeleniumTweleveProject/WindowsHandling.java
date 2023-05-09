package TwelevPmBatch.NewSeleniumTweleveProject;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/");

		String parentWindow = driver.getWindowHandle();

		WebElement windowBtn = driver.findElement(By.xpath(
				"//div[contains(@class,'single_tab_div resp-tab-content resp-tab-content-active')]//a[@href='#']"));
		windowBtn.click();

		Set<String> windows = driver.getWindowHandles();
		for (String w : windows) {
			if (parentWindow.equals(w)) {

			} else {
				driver.switchTo().window(w);
			}
		}

		WebElement cheatSheets = driver.findElement(By.xpath("//li[@id='menu-item-6898']/a[text() ='CheatSheets']"));
		cheatSheets.click();

		// driver.close();
		driver.quit();

	}

}
