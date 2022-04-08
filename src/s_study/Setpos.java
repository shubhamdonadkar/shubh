package s_study;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setpos {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\path for driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
driver.manage().window().maximize();
//driver.manage().window().setPosition(new.);
	driver.manage().window().setPosition(new Point(1000, 500) );
		//System.out.println(driver.manage().window().getPosition().getX());
	//	System.out.println(driver.manage().window().getPosition().getY());
		Dimension d=new Dimension(250, 600);
	
		driver.manage().window().setSize(d);
	System.out.println(driver.manage().window().getSize().getHeight());
//		System.out.println(driver.manage().window().getSize().width);
//		System.out.println(driver.manage().window().getSize().getWidth());
System.out.println(driver.manage().window().getSize().height);

		
		
		
		
		
		
	}

}
