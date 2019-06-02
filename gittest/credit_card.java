import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class credit_card {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32.zip3\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.facebook.com");
		//"C:\Users\Administrator\Downloads\chromedriver_win32.zip ..latest one\chromedriver.exe"
		//"C:\Users\Administrator\Downloads\chromedriver_win32.zip ..latest one\chromedriver.exe"
	 // driver.findElement(By.xpath("//a[@id='navAutoLoans']//span[@class='title'][contains(text(),'Auto Loans')]")).click();
		//driver.findElement(By.xpath("//input[@id='nav-search-query']")).sendKeys("mobile banking");
		//driver.findElement(By.xpath("//input[@title='Search']")).click();
		//driver.findElement(By.xpath("//input[@id='onlineId1']")).sendKeys("athahar");
		//driver.findElement(By.xpath("//input[@id='passcode1']]")).sendKeys("kkkk");
		//driver.findElement(By.xpath("//span[contains(text(),'Sign In')]")).click();
		//driver.findElement(By.xpath("//input[@id='search-input']")).sendKeys("mobile banking");
		/*System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());//
		driver.get("http:/yahoo.com");
		//driver.navigate().back();//
		//driver.navigate().forward();//
		//driver.close();//
		driver.quit();*/
	}
	
}