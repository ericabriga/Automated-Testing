import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest {
	
	String url;
	private static WebDriver driver;
	String username;
	String password;
	
	
	@Before
	public void setUp(){
        System.setProperty("webdriver.chrome.driver", "/Users/Erica/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        url = "http://thedemosite.co.uk/";
	}
	
	@After
	public void teardown() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.quit();
	}

	@Test
    public void testChromeSelenium() {
				
        driver.get(url);
        driver.get("http://thedemosite.co.uk/addauser.php/");
        driver.findElement(By.name("username")).sendKeys("ericu");
		driver.findElement(By.name("password")).sendKeys("google16");
        //driver.findElement(By.name("FormsButton2")).click();
        driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[3]/td[2]/p/input"));
	}

}