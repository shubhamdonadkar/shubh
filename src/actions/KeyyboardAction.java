package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;




public class KeyyboardAction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\path for driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 Thread.sleep(1000);
	 driver.manage().window().maximize();
	 driver.findElement(By.linkText("Create New Account")).click();
	 Thread.sleep(1000);
	WebElement daybutton = driver.findElement(By.id("day"));
	
	Actions act=new Actions(driver);
	act.click(daybutton).perform();

	WebElement firstname = driver.findElement(By.name("firstnames")); Thread.sleep(1000);
	act.click(firstname).keyDown(Keys.SHIFT).sendKeys("ukrain").build().perform(); Thread.sleep(1000);
	act.click(daybutton).perform(); Thread.sleep(100);
	act.sendKeys(Keys.ARROW_DOWN).perform();
	act.sendKeys(Keys.ARROW_DOWN).perform();
	for(int i=1;i<=15;i++) {
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(100);
	}
	for(int i=1;i<=17;i++) {
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(200);
	}
	act.sendKeys(Keys.ENTER).perform();
	
	
	
	
}
}