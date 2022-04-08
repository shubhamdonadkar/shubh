package useofFindelements;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion1 {
	public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "G:\\path for driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	Thread.sleep(1000);
	driver.manage().window().maximize();	Thread.sleep(1000);
	driver.findElement(By.name("q")).sendKeys("bike");
	Thread.sleep(1000);
	List<WebElement> searchbar = driver.findElements(By.xpath("(//ul)[1]//li"));
	System.out.println(searchbar.size());
	for(WebElement w:searchbar) {
		String Actual = w.getText();
		System.out.println(Actual);
		String Expected = "bike insurance";
		if(Actual.equals(Expected)) {
			w.click();
			break;
		}
	}Thread.sleep(1000);
	driver.findElement(By.linkText("Images")).click();

}
}