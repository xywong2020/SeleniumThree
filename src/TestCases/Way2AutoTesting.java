package TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Way2AutoTesting {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.way2automation.com/angularjs-protractor/registeration/#/login");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username")));
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("angular");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("password");
		
		WebElement username2 = driver.findElement(By.xpath(("//input[@id=\'formly_1_input_username_0\'][1]")));
		username2.sendKeys("username_desc");
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/form/div[3]/button")).click();
		
		WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait2.until(ExpectedConditions.textToBePresentInElementLocated(By.className("ng-scope"), "You're logged in!!"));
		
		System.out.println("Login sucessfully");
		
		driver.quit();
	}

}
