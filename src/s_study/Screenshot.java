package s_study;
//import java.io.File;
//import java.io.IOException;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	public static void main(String[] args, Object OutputType) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","G:\\path for driver\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
//	File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
}
}