import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class method {
	
	public void main() {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//span[contains(text(),'Hotels')]")).click();
		Select s= new Select (driver.findElement(By.id("ddl_Adult_MST")));
	
	   // s.selectByValue("USD");
		//s.selectByVisibleText("AED");
		s.selectByIndex(0);
		s.selectByIndex(1);
		s.selectByIndex(2);
		s.selectByIndex(3);

}

	public void IE()
	{
	
		//System.setProperty("webdriver.ie.driver", "C:\\IE drive\\MicrosoftWebDriver.exe");
		WebDriver driver =new InternetExplorerDriver();
		driver.get("http://bankofamerica.com");
		driver.findElement(By.xpath("//a[@id='navAutoLoans']//span[@class='title'][contains(text(),'Auto Loans')]")).click();
		driver.findElement(By.xpath("//input[@id='nav-search-query']")).sendKeys("mobile banking");
		driver.findElement(By.xpath("//input[@title='Search']")).click();
		driver.findElement(By.xpath("//input[@id='onlineId1']")).sendKeys("jony-ata-karim");
		driver.findElement(By.xpath("//input[@id='passcode1']]")).sendKeys("123456");
		driver.findElement(By.xpath("//span[contains(text(),'Sign In')]")).click();
		driver.findElement(By.xpath("//input[@id='search-input']")).sendKeys("mobile banking");
		
	}
}
