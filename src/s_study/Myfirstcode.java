package s_study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myfirstcode {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\path for driver\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	 driver.get("https://vctcpune.com/selenium/practice.html");


	}

}
