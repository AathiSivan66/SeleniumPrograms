package TwelevPmBatch.NewSeleniumTweleveProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import io.netty.util.internal.SystemPropertyUtil;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class ReadingPropertyFile {

	public static void main(String[] args) throws IOException {

		// System.out.println("Url of the application : " + Url);

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\THIS PC\\eclipse-workspace\\NewSeleniumTweleveProject\\src\\main\\java\\Utilties\\TestData.properties");

		prop.load(fis);

		String urlAddress = prop.getProperty("Url");
		String uName = prop.getProperty("Username");
		String emailId = prop.getProperty("EmailID");

		System.out.println("Url Address of the application : " + urlAddress);
		System.out.println("UserName of the User : " + uName);
		System.out.println("Email ID of the USer : " + emailId);

	}

}
