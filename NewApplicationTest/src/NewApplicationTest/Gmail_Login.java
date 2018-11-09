package NewApplicationTest;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmail_Login {
/**
* @param args
*/
       public static void main(String[] args) {
             
    	      System.setProperty("webdriver.chrome.driver", "C:\\Users\\digv.singh\\Downloads\\selenium\\chromedriver_win32\\chromedriver.exe");
              WebDriver driver = new ChromeDriver();
              String appUrl ="https://accounts.google.com/signin";
// launch the chrome browser and open the application url
              driver.get(appUrl);
             
// maximize the browser window
              driver.manage().window().maximize();
             
// declare and initialize the variable to store the expected title of the webpage.
              String expectedTitle =driver.getTitle();
              System.out.println(expectedTitle);
              
            
             
  // opening the signin link 
             String URl= driver.getTitle();
             if(URl.equals("Sign in – Google accounts")){
            	 System.out.println("Login page found proceed with login ");
             	}
             else
            	 System.out.println("incorrect URL ");
             
        // start login by enter username :
             driver.findElement(By.id("identifierId")).sendKeys("digusingh132"); 

              

             WebDriverWait wait=new WebDriverWait(driver, 20);    
             

             driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();     
             
             

             driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);        

             WebElement password=driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']"));
             wait.until(ExpectedConditions.elementToBeClickable(password));
             password.sendKeys("Suresh@01");

             driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click(); 
          
             
       }
}