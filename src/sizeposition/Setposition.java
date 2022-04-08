package sizeposition;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setposition {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","G:\\path for driver\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
     driver.get("https://skpatro.github.io/demo/links/");
     Thread.sleep(1000);
     driver.manage().window().maximize();
     Thread.sleep(1000);
//for position we have to create object of point class
     Point p=new Point(85,12 );
     driver.manage().window().setPosition(p);
    System.out.println(driver.manage().window().getPosition());
    driver.quit();
}
}