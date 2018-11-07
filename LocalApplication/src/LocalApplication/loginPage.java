package LocalApplication;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class loginPage {
	@Test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// to chefck 
	      System.setProperty("webdriver.chrome.driver", "C:\\Users\\digv.singh\\Downloads\\selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String appUrl ="http://localhost/blog/public/login";
        driver.get(appUrl);
        
        //login using ID :
        WebElement username= driver.findElement(By.id("email"));
        username.sendKeys("Jayasimha.mudduluru@cgi.com");
        
        WebElement password= driver.findElement(By.id("password"));
        password.sendKeys("password");
        driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();
        
       String Title= driver.getTitle();
       if(Title.equals("Laravel")) {
       System.out.println("Login complete");}
       else
    	   System.out.println("login failed");
       
       
       /// code to post anything in posts sections 
       driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul[1]/li[4]/a")).click();
       driver.findElement(By.xpath("//*[@id=\"title\"]")).sendKeys("My new Post");
       driver.findElement(By.xpath("//*[@id=\"body\"]")).sendKeys(" description");
       
       //attach images
       WebElement upload= driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/form/div[2]/input"));
      // upload.click();
       upload.sendKeys("C:\\Users\\digv.singh\\Documents\\Office_work\\1.jpg");
       
       
       Select category= new Select(driver.findElement(By.id("category")));
       category.selectByVisibleText("2");
       driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/form/input[2]")).click();
       
	
	}
	

}
