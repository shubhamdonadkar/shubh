package popup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childbrowser {


	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","G:\\path for driver\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
     driver.get("https://skpatro.github.io/demo/links/");
     Thread.sleep(1000);
     driver.manage().window().maximize();
     Thread.sleep(1000);
    WebElement newwondowbutton = driver.findElement(By.name("NewWindow"));
    newwondowbutton.click();
   String mainpageid = driver.getWindowHandle();
   Set<String> Allids = driver.getWindowHandles();
  Iterator<String> objofit = Allids.iterator();
  objofit.next();//mainpageid
  String childid = objofit.next();//childid
  driver.switchTo().window(childid); Thread.sleep(1000);
   driver.manage().window().maximize();
   Thread.sleep(1000);
   driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("vijaykulkarnisir@135");
   Thread.sleep(1000);
   driver.manage().window().minimize();
   Thread.sleep(1000);
   driver.switchTo().window(mainpageid);
   driver.findElement(By.xpath("//input[@value='Home']")).click();

}
}