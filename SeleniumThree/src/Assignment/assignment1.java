package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Keys;


public class assignment1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com/");

		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Way2Automation"+ Keys.ENTER);
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(45));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("center_col")));
		
		
		//List <WebElement> SearchLink  = driver.findElements(By.cssSelector("#kp-wp-tab-overview > div:nth-child(32) > div > div > div > div > div > div > div > div > div > div > div > div.yuRUbf > div > span a"));
		//System.out.println("Total size are " + SearchLink.size());
		
		//String Link = SearchLink.get(0).getAttribute("href"); 
		
		//System.out.println("First Link URL is " + Link );
		
		WebElement searchLink = driver.findElement(By.cssSelector("#kp-wp-tab-overview > div:nth-child(32) > div > div > div > div > div > div > div > div > div > div > div > div.yuRUbf > div > span a"));
		driver.quit();
		//List <WebElement> SearchLink = driver.findElements(By.xpath("//*[contains(@class,'zReHs')]"));
		
		//System.out.println("Total size are " + SearchLink.size());
		
		//String Link = SearchLink.get(0).getAttribute("href"); 
		
		
		//System.out.println("First Link URL is " + Link );
		
		//Link.click();
		
	}

}
//List <WebElement> SearchLink = driver.findElements(By.tagName("a"));
/*
List <WebElement> SearchText = driver.findElements((By.tagName("h3")));

for(WebElement result : SearchText) {
	
	String text = result.getText() ; 
	System.out.println("Text are  " + text  );
}*/
//WebElement firstLink = driver.findElement(By.xpath("//a[contains(@href,Link)]"));
/*
for(WebElement result : SearchLink) {
	
	String Link = result.getAttribute("href") ; 
	System.out.println("url is" + Link );
	
	
}*/
/*
List<String> link = new ArrayList<>(SearchLink.getAttribute("href"));
for(int i=0;i<SearchLink.size();i++)
{
	link = SearchLink.getAttribute("href");
	System.out.println("first url is " + link);
	System.out.println("Other url are" + link[i]);
}*/