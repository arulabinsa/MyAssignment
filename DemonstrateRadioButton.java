package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemonstrateRadioButton {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/radio.xhtml");
		//select the favourite browser
		WebElement x = driver.findElement(By.xpath
				("//label[@for='j_idt87:console1:0']"));
		x.click();
		Thread.sleep(2000);
		x.click();
			Thread.sleep(5000);
			
			WebElement element = driver.findElement
					(By.xpath("//span[@class = 'ui-radiobutton-icon ui-icon ui-icon-blank ui-c']"));
			
			boolean selected =element.isEnabled();
			System.out.println("The browser is selected "+ " " + selected);
			
			  WebElement ageGroup = driver.findElement(By.xpath("//input[@value='21-40 Years']"));
	            if (!ageGroup.isSelected()) {
	                ageGroup.click();
	                System.out.println("Age group '21-40 Years' selected.");
	            } else {
	                System.out.println("Age group '21-40 Years' was already selected.");
	            }
		
	}

}
