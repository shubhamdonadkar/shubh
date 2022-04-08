package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\path for driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement rightclickbutton = driver.findElement(By.xpath("//span[text()='right click me']"));
	
		
		Thread.sleep(1000);
		Actions act=new Actions(driver);
		Thread.sleep(3000);
		//firstway
	//	act.contextClick(rightclickbutton).perform();
		//2nd way
		act.moveToElement(rightclickbutton).contextClick().build().perform();
}
}