package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickusingAction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\path for driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	 driver.get("https://vctcpune.com/selenium/practice.html");
	 Thread.sleep(1000);
	 driver.manage().window().maximize();
	 WebElement checkBoxOption1 = driver.findElement(By.id("checkBoxOption1"));
	 
	 //1.create object of driver class which will accept driver as an argument
	 Actions act=new Actions(driver);

  //2. using ACtions class object call required method, then use perform method
//first way
   // act.click(checkBoxOption1).perform();
    //second way
    act.moveToElement(checkBoxOption1).click().build().perform();
}
}