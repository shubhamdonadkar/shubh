package popup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cpr {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","G:\\path for driver\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
     driver.get("https://skpatro.github.io/demo/links/");
     Thread.sleep(1000);
     driver.manage().window().maximize();
     Thread.sleep(1000);
     driver.findElement(By.name("NewWindow")).click();
     //when child browser is there that time we have to get window ids
   String mainpageid = driver.getWindowHandle();
   System.out.println(mainpageid);
  Set<String> allids = driver.getWindowHandles();
  System.out.println(allids);
  Iterator<String> it = allids.iterator();
  String mainid = it.next();//0th position
 String child = it.next();//1st position
  driver.switchTo().window(child);
  driver.manage().window().maximize();
  driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("vijay@gmail.com");
driver.findElement(By.xpath("//a[@class='submit']")).click();
driver.switchTo().window(mainid);

driver.findElement(By.xpath("//input[@name='home']")).click();

}
}