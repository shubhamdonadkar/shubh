package sizeposition;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setsize {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","G:\\path for driver\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
     driver.get("https://skpatro.github.io/demo/links/");
     Thread.sleep(1000);
     driver.manage().window().maximize();
     Thread.sleep(1000);
     //for setting size we need to use dimension class and create the object of dimension class
     Dimension d=new Dimension(10, 15);
     driver.manage().window().setSize(d);
     Thread.sleep(1000);
    
     System.out.println("the size of open window is "+ driver.manage().window().getSize());
     driver.quit();
     

	}

}
