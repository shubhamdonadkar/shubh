package s_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","G:\\path for driver\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
		WebElement signupbutton = driver.findElement(By.xpath("//a[text()='Sign up for Facebook']"));
		signupbutton.click();
		WebElement daybox = driver.findElement(By.id("day"));
		WebElement monthbox = driver.findElement(By.id("month"));
		WebElement yearbox = driver.findElement(By.id("year"));
		
		Select s=new Select(daybox);
		Select s1=new Select(monthbox);
		Select s2=new Select(yearbox);
		s.selectByVisibleText("24");
		Thread.sleep(1000);
		s1.selectByIndex(10);
		Thread.sleep(1000);
		s2.selectByValue("2000");
		System.out.println(s.isMultiple());
		System.out.println(s1.isMultiple());
		System.out.println(s2.isMultiple());
		

	}

}
