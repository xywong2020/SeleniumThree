package TestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class testcases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WebDriver driver3 = new ChromeDriver();
		//driver3.get("https://www.way2automation.com/");
		
		//driver3.quit();
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://tiktok.com/search?q=flower");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Check if the full video feed list is returned?
		List <WebElement> VideoListing = driver.findElements(By.xpath("//*[contains(@class,'--AVideoContainer')]"));
		
		for(WebElement video: VideoListing) {
			
			String url = video.getAttribute("href"); 
			System.out.println("URL:  " + url);
		}
		
		//explicit wait
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("column-item-video-container-0"))).click();
				
		//Check the 1st video in the list is displayed
		//WebElement searchResult = driver.findElement(By.id("column-item-video-container-0"));
		//System.out.println(searchResult.isDisplayed()); 
		//searchResult.click();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   Wait<WebDriver> wait3 = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(10))
			       .pollingEvery(Duration.ofSeconds(1))
			       .ignoring(NoSuchElementException.class);
		
		WebElement BrowserView = driver.findElement(By.xpath("//*[@id=\"tabs-0-panel-search_top\"]/div[3]/div"));
		System.out.println("Search Result is clickable " +BrowserView.isDisplayed());
		
		
		driver.quit();
	}

}

//driver.manage().window().minimize();

/*try {
    Thread.sleep(10000); // Pauses execution for 5 seconds (5000 milliseconds)
} catch (InterruptedException e) {
    Thread.currentThread().interrupt(); // Restore the interrupted status
}*/