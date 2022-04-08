package s_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
     System.setProperty("webdriver.chrome.driver", "G:\\path for driver\\chromedriver_win32\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.get("https://www.facebook.com");
     driver.manage().window().maximize();
     Thread.sleep(1000);
     driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("dinba12@gmailcom");
     Thread.sleep(1000);
    // driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("abc1235");
  //   Thread.sleep(1000);
  //  driver.findElement(By.xpath("//button[@name='login']")).click();
   Thread.sleep(1000);
 //  driver.manage().window().minimize();
   driver.findElement(By.xpath("(//a[@waprocessedanchor='true'])[12]")).click();
	}

}
