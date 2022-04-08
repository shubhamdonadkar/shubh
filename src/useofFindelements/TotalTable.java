package useofFindelements;

import java.util.Iterator;
import java.util.List;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalTable {
public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\path for driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	 driver.get("https://vctcpune.com/selenium/practice.html");
	 Thread.sleep(1000);
	 driver.manage().window().maximize();
	List<WebElement> totalInputTap = driver.findElements(By.tagName("input"));
	System.out.println(totalInputTap.size());
//	for(WebElement w:totalInputTap) {
//		System.out.println(w.getLocation());
//	}
//for(int i=0;i<totalInputTap.size();i++) {
//	System.out.println(totalInputTap.get(i));
//}
Iterator<WebElement> it = totalInputTap.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
}
	}

}
