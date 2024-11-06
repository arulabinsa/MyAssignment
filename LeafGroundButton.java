package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundButton {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/button.xhtml");
		//Click on the button with the text ‘Click and Confirm title.’
		WebElement element = driver.findElement(By.xpath("//span[@class ='ui-button-text ui-c']"));
		element.click();
		//Verify that the title of the page is ‘dashboard.’
		String title = driver.getTitle();
		System.out.println("The title of the page is " +" " + title);
	Thread.sleep(5000);
	driver.get("https://leafground.com/button.xhtml");
	
	//Check if the button with the text ‘Confirm if the button is disabled’ is disabled.
	WebElement element2 = driver.findElement(By.xpath("//span[@class ='ui-button-text ui-c']"));
	boolean selected = element2.isEnabled();
	System.out.println("The confirm button disbaled is" + selected);
	
	//Find and print the position of the button with the text ‘Submit.’
	WebElement element3 = driver.findElement(By.name("j_idt88:j_idt94"));
	Point location = element3.getLocation();
	System.out.println("Location " + location);
    String text = element3.getText();
    System.out.println("The text of the button is " +text);
    
    //Find and print the background color of the button with the text ‘Find the Save button color.’
    WebElement element4 = driver.findElement(By.name("j_idt88:j_idt96"));
    String cssValue = element4.getCssValue("background-color");
    System.out.println("Backround color is "+ cssValue);
    
    //find the height and width of the button
    WebElement element5 = driver.findElement(By.name("j_idt88:j_idt98"));
    Dimension size = element5.getSize();
    System.out.println("Find the height and width of this button" + size);
    
    //close browser
    driver.close();


	

	}

}
