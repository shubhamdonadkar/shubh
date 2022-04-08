package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Forms {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\path for driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

	driver.get("https://demoqa.com/automation-practice-form");
	Thread.sleep(100);
	driver.manage().window().maximize();
	Thread.sleep(1000);
	WebElement firstName = driver.findElement(By.id("firstName"));
	Actions act=new Actions(driver);
	act.click(firstName).perform();
	act.keyDown(Keys.SHIFT).sendKeys("shubham").keyUp(Keys.SHIFT).build().perform();
	act.sendKeys(Keys.TAB).keyDown(Keys.SHIFT).sendKeys("donadkar").keyUp(Keys.SHIFT).build().perform();
	act.sendKeys(Keys.TAB).sendKeys("shubh24@gmail.com").build().perform();
	act.sendKeys(Keys.TAB).sendKeys(Keys.SPACE).build().perform();
	act.sendKeys(Keys.TAB).sendKeys("9874563215").build().perform();
	act.sendKeys(Keys.TAB).sendKeys("24 nov 1995").sendKeys(Keys.ENTER).build().perform();
	act.sendKeys(Keys.TAB).sendKeys("Ma").sendKeys(Keys.ENTER).build().perform();
	act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.SPACE).build().perform();
	act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("at post gondpipri sankya cha ghar").build().perform();
	act.sendKeys(Keys.TAB).sendKeys("Ha").sendKeys(Keys.ENTER).build().perform();
	act.sendKeys(Keys.TAB).sendKeys("pa").sendKeys(Keys.ENTER).perform();
	act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
}
}