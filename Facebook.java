package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		//Maximize the window
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		//implicit wait to ensure the web page elements are fully loaded
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@data-testid ='open-registration-form-button']")).click();
		driver.findElement(By.name("firstname")).sendKeys("AAA");
		driver.findElement(By.name("lastname")).sendKeys("Bfgfdfg");
		driver.findElement(By.name("reg_email__")).sendKeys("7554433432");
		driver.findElement(By.id("password_step_input")).sendKeys("adfgfg123");
		
		//locate dropdown and select day
		WebElement element = driver.findElement(By.name("birthday_day"));
		//create object for select and pass the webelement reference inside the constructor
		Select source =new Select(element);
		source.selectByValue("20");
		
		WebElement element1 = driver.findElement(By.name("birthday_month"));
		//create object for select and pass the webelement reference inside the constructor
		Select sources =new Select(element1);
		sources.selectByValue("11");
		
		WebElement element2 = driver.findElement(By.name("birthday_year"));
		//create object for select and pass the webelement reference inside the constructor
		Select sourcesa =new Select(element2);
		sourcesa.selectByValue("1999");
		
		WebElement radio = driver.findElement(By.className("_8esa"));
		radio.click();
		driver.findElement(By.name("websubmit")).click();
		driver.close();
		
		
		
		
	}

}
