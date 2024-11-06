package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AccountCreation {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("arulabinsasa");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		//locate the dropdown element and select industry
		WebElement element = driver.findElement(By.name("industryEnumId"));
		//create object for select and pass the webelement reference inside the constructor
		Select source =new Select(element);
		//use select method to select value
		source.selectByIndex(3);
		//locate  the dropdown element and select 
		WebElement element2 = driver.findElement(By.name("ownershipEnumId"));
		//create object for select class and pass the webelement reference inside the constructor
		Select sourced=new Select(element2);
		//use select methods to select the value
		sourced.selectByVisibleText("S-Corporation");
		//locate the dropdown element and select source
		WebElement element3 = driver.findElement(By.id("dataSourceId"));
		//create object for select class and pass the webelement reference inside the constructor
		Select sourcedd=new Select(element3);
		//use select methods to select vale
		sourcedd.selectByValue("LEAD_EMPLOYEE");
		
        //locate the dropdown element and select marketing campaign
		WebElement element4 = driver.findElement(By.id("marketingCampaignId"));
		//create object for select class and pass the webelement reference inside the constructor
		Select sourceddd=new Select(element4);
	    //use select methods to select vale
		sourceddd.selectByIndex(6);
								
		//locate the dropdown element and select tate/province
		WebElement element5 = driver.findElement(By.id("generalStateProvinceGeoId"));
		//create object for select class and pass the webelement reference inside the constructor
		Select sour= new Select(element5);
		//use select methods to select vale
		sour.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		driver.close();
		
				
				
		
		
		
	}

}
