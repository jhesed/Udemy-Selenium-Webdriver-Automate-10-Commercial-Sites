/**
 * Practicing Selenium in a Google Chrome browser
 * @author Jhesed Tacadena
 * @date February 8, 2017
 * */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChromeAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		// Tells the web driver to wait implicitly to allow browser to load it first
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// It would be wiser to use load explicitly (refer to `wait.until()` function)
		
		// Open a URL
		driver.get("http://techno-geek.co.uk/callmycab/");
		
		// Maximize the window
		driver.manage().window().maximize();
			
		// Retrieve the browser title
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		
		// Retrieve current url
		String url = driver.getCurrentUrl();
		System.out.println("Current URL: " + url);
		
		// Retrieve page source
		String source = driver.getPageSource();
		System.out.println("Page source: " + source);
		
		// Example of explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='navbar']/ul/li[1]/a/nav/span[2]")));
		
		// Automate click using XPath expressions
		// or use `By.id()` directly
		driver.findElement(By.xpath(".//*[@id='navbar']/ul/li[1]/a/nav/span[2]")).click();
		
		// Determining Xpath without using firefox's firepath plugin:
		// Syntax: "//tagname[@attribute='value']"
		// Fill up the input field "name" automatically
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Jhesed Tacadena");
		
		// Check checkbox automatically, use click() also. Call it twice to uncheck
		// Apply same principle with radio buttons, but use the specific id
		driver.findElement(By.xpath(".//*[@id='development']")).click();
		
		// Automatically check if the checkbox was already seleted
		System.out.println(driver.findElement(By.xpath(".//*[@id='development']")).isSelected());
		
		
		// Closes the browser
		driver.close();
	}

}
