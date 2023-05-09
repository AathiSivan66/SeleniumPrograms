package TwelevPmBatch.NewSeleniumTweleveProject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://demo.automationtesting.in/Alerts.html");

		driver.findElement(By.cssSelector("button[onclick='alertbox()']")).click();

		Thread.sleep(3000);

		Alert alert = driver.switchTo().alert();

		alert.accept();

		driver.findElement(By.cssSelector("a[href='#CancelTab']")).click();

		driver.findElement(By.cssSelector("button[onclick='confirmbox()']")).click();

		alert.dismiss();

		driver.findElement(By.cssSelector("a[href='#Textbox']")).click();

		driver.findElement(By.cssSelector("button[onclick='promptbox()']")).click();

		alert.sendKeys(" SUMMER IS HERE ");

		String alertMsg = alert.getText();

		System.out.println(alertMsg);

		alert.accept();

	}

}
