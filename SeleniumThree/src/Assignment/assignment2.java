package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class assignment2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.way2automation.com/way2auto_jquery/index.php");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"load_box\"]")));
		
		System.out.println("Registration form loaded");
		
		WebElement name = driver.findElement(By.xpath("//input[@name=\"name\"]"));
		name.sendKeys("wxy");
		
		//WebElement password = driver.findElement(By.xpath("//*[@id=\"load_form\"]/fieldset[2]/input"));
		WebElement phone = driver.findElement(By.name("phone"));
		phone.sendKeys("123457788");
		
		WebElement email = driver.findElement(with(By.tagName("input")).above(By.tagName("select")));
		email.sendKeys("wxy@test.com");
		
		WebElement country = driver.findElement((By.tagName("select")));
		country.sendKeys("Malaysia");
		
		
		WebElement city = driver.findElement((By.cssSelector("#load_form > fieldset:nth-child(9) > input[type=text]")));
		city.sendKeys("KL");
		
		//WebElement username = driver.findElement(By.xpath("//input[@name=\"username\"]"));
		WebElement username = driver.findElement(By.cssSelector("#load_form > fieldset:nth-child(10) > input[type=text]"));
		username.sendKeys("userwxy");
		
		
		WebElement password = driver.findElement(By.cssSelector("#load_form > fieldset:nth-child(11) > input[type=password]"));
		password.sendKeys("pwd");
		
		//driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/form/div[1]/div[2]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"load_form\"]/div[1]/div[2]/input")).click();// --> Use copy xpath way, this not works, button unclickable, error msg "element not interactable" returns
		//driver.findElement(By.xpath("//div[@id='load_box']//input[@class='button']")).click(); --> This works
		


		//Submit.click();
		
		
		//driver.findElement(By.xpath("//div[@id='load_box']//input[@type='submit']")).click();
		
		WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(45));
		wait2.until(ExpectedConditions.textToBe((By.id("alert")),"This is just a dummy form, you just clicked SUBMIT BUTTON"));
		
		
		driver.quit();
	}

}
