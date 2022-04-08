package useofFindelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\path for driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	 driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
	 Thread.sleep(1000);
	 List<WebElement> coloums = driver.findElements(By.xpath("//table[@id='customers']//tr[1]//th"));
	int Totalcoloums = coloums.size();
	System.out.println("total number of coloums "+Totalcoloums);
	List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
	int TotalRows = rows.size();
	System.out.println("total number od rows are "+TotalRows);
	for(int i=1;i<=TotalRows;i++) {
		String text;
		for(int j=1;j<=Totalcoloums;j++) {
			if(i==1) {
				text=driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]//th["+j+"]")).getText();
				System.out.print(text+" ");
			}else {
				text=driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]//td["+j+"]")).getText();
				System.out.print(text+" ");
			}
		}System.out.println();
	}
}
}