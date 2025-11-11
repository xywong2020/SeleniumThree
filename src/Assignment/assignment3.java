package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment3 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://timesofindia.indiatimes.com/poll.cms");
		driver.findElement(By.xpath("//*[@id=\"pollform\"]/table/tbody/tr[2]/td/input[1]")).click();
		String result = driver.findElement(By.id("mathq2")).getText();
		System.out.println("The text result is " + result);
		
		String[] strArray = result.split(" ");
	
		
		for(int i=0; i<strArray.length; i++) {
			System.out.println(strArray[i]);
			
		}
		
		int Sum=0;
		Sum = Integer.parseInt(strArray[0]) + Integer.parseInt(strArray[2]);
		System.out.println("Sum is " + Sum);	
		
		driver.findElement(By.id("mathuserans2")).sendKeys(String.valueOf(Sum));
		//driver.findElement(By.className("homesprite vot")).click();
		driver.findElement(By.xpath("//*[@id=\"pollform\"]/table/tbody/tr[4]/td/div")).click();
		
		//*[@id="pollform"]/table/tbody/tr[4]/td/div
		
		
		
		try {
	    Thread.sleep(5000); // Pauses execution for 5 seconds (5000 milliseconds)
	} catch (InterruptedException e) {
	    Thread.currentThread().interrupt(); // Restore the interrupted status
	}

		driver.quit();
	}

}
