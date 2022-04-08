package s_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getext {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\path for driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//System.out.println(driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']")).getText());
		
		WebElement webelement = driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
		webelement.getText();
		String actual = webelement.getText();
		System.out.println(actual);
        String expected = "Facebook helps you connect and share with the people in your life.";
        if(actual.equals(expected)) {
        	System.out.println("the given text matching the expected text so here test case is passed");
        	
        }else {
        	System.out.println("text is not matching so test case is failed");
        	
        }
	}

}
