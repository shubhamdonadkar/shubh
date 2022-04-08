package actions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\path for driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement doubleclickbutton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	//	create object of action class and pass argument as driver
		Actions act=new Actions(driver);
		//1st way
	//	act.doubleClick(doubleclickbutton).perform();
		//2nd way
		act.moveToElement(doubleclickbutton).doubleClick().build().perform();
		
		Alert ar=driver.switchTo().alert();
		Thread.sleep(3000);
		ar.accept();
		
		
}
}