package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		//Enter all the fields
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");
        driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Anto");
        driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("jenu");
        driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("ADFFF");
        driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
        driver.findElement(By.id("createLeadForm_description")).sendKeys("hgdsh jhdgfhdg jhegfhdg");
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@gmail.com");
        WebElement element = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
        Select source = new Select(element);
        source.selectByVisibleText("New York");
        driver.findElement(By.className("smallSubmit")).click();
        driver.findElement(By.linkText("Edit")).click();
        WebElement element2 = driver.findElement(By.name("description"));
        element2.clear();
        driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("zxhbchds jhsbjhdsc jhscjhsbc");
        driver.findElement(By.className("smallSubmit")).click();
        String title = driver.getTitle();
        System.out.println("The title is "+ title);
        driver.close();

        
	}

}
