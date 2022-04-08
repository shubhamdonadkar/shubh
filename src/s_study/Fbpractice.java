package s_study;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fbpractice {
	public static void main(String[] args, Object OutputType) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","G:\\path for driver\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
		WebElement signupbutton = driver.findElement(By.xpath("//a[text()='Sign up for Facebook']"));
		signupbutton.click();
		Thread.sleep(1000);
	    driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("dinesh");
	    Thread.sleep(1000);
	    driver.findElement(By.name("lastname")).sendKeys("donadkar");
	    Thread.sleep(1000);
	    driver.findElement(By.name("reg_email__")).sendKeys("donadkar@gmail.com");
	    Thread.sleep(1000);
	    driver.findElement(By.name("reg_passwd__")).sendKeys("122@S");
	    Thread.sleep(1000);
	    WebElement day = driver.findElement(By.id("day"));
	    Select s=new Select(day);
	    WebElement month = driver.findElement(By.id("month"));
	    Select s1=new Select(month);
	    WebElement year = driver.findElement(By.id("year"));
	    Select s2=new Select(year);
	    s.selectByIndex(1);
	    Thread.sleep(1000);
	    s1.selectByValue("11"); 
	    Thread.sleep(1000);
	    s2.selectByVisibleText("1994");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@value='2']")).click();
	  System.out.println( s.isMultiple());
	
	
	
	
	
	
	  
	}
}