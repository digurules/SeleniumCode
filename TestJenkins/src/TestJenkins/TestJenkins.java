package TestJenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestJenkins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

	 
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\digv.singh\\Downloads\\selenium\\chromedriver_win32\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       String appUrl ="https://www.google.com/";
       driver.get(appUrl);
       
driver.quit();
	}
}
