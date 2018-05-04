package DemoQa;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DraggablePage {
	
	WebDriver driver; 
	Actions action;
	
	@FindBy(xpath= "//*[@id=\"draggableview\"]/p")
	private WebElement drag;
	
	public void dragToBox(WebDriver driver) {
	this.driver = driver;
	this.action = new Actions(driver);
	action.dragAndDropBy(drag, 140, 0).perform();
	}

}