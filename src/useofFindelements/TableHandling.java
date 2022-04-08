package useofFindelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\path for driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	 driver.get("https://www.cricbuzz.com/cricket-series/3202/icc-womens-world-cup-2022/stats");
	 Thread.sleep(1000);
	List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table table-responsive cb-series-stats']//tr"));
	int TotalRow = rows.size();
	System.out.println("total rows are "+TotalRow);
	List<WebElement> coloums = driver.findElements(By.xpath("//table[@class='table table-responsive cb-series-stats']//tr[1]//th"));
	int Totalcoloums = coloums.size();
	System.out.println("Total coloums are "+Totalcoloums);
	List<WebElement> Headers = driver.findElements(By.xpath("//table[@class='table table-responsive cb-series-stats']//tr[1]//th"));
	for(WebElement w:Headers) {
		System.out.print(w.getText()+" || ");}
	System.out.println();
	
	for(int i=1;i<TotalRow;i++) { String text;
		for(int j=1;j<=Totalcoloums;j++) {
			if(i==1) {
				text=driver.findElement(By.xpath("//table[@class='table table-responsive cb-series-stats']//tr["+i+"]//td["+j+"]")).getText();
				System.out.print(text+"||");
			}else {
				text=driver.findElement(By.xpath("//table[@class='table table-responsive cb-series-stats']//tr["+i+"]//td["+j+"]")).getText();
				System.out.print(text+"||");
			}
			
		}System.out.println();
	}
	
	
}
}