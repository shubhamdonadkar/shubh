package gecko;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class First {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","G:\\path for driver\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver gecko=new FirefoxDriver();
		
		gecko.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(100);
		gecko.manage().window().maximize();
		Thread.sleep(1000);
		WebElement firstName = gecko.findElement(By.id("firstName"));
		Actions act=new Actions(gecko);
		act.click(firstName).perform();
		act.keyDown(Keys.SHIFT).sendKeys("shubham").keyUp(Keys.SHIFT).build().perform();
		act.sendKeys(Keys.TAB).keyDown(Keys.SHIFT).sendKeys("donadkar").keyUp(Keys.SHIFT).build().perform();
		act.sendKeys(Keys.TAB).sendKeys("shubh24@gmail.com").build().perform();
		act.sendKeys(Keys.TAB).sendKeys(Keys.SPACE).build().perform();
		act.sendKeys(Keys.TAB).sendKeys("9874563215").build().perform();
		act.sendKeys(Keys.TAB).sendKeys("24 nov 1995").sendKeys(Keys.ENTER).build().perform();
		
   
           
	}

}
