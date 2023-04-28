package parabank;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BillPay {
	
	public static void main(String[] args) {
		

		        // Set the path to the ChromeDriver executable
		        System.setProperty("webdriver.chrome.driver\",\"C:\\Users\\hp\\Desktop\\selenuim jars\\chromedriver_win32\\chromedriver.exe");

		        // Create a new instance of the ChromeDriver
		        WebDriver driver = new ChromeDriver();

		        // Navigate to the Parabank web application
		        driver.get("https://parabank.parasoft.com/parabank/index.htm");

		        // Find the "Bill Pay" item on the page
		        WebElement billPay = driver.findElement(By.xpath("//a[contains(text(),'Bill Pay')]"));

		        // Check if the "Bill Pay" item is displayed
		        if (billPay.isDisplayed()) {
		            System.out.println("The 'Bill Pay' item is displayed on the page.");
		        } else {
		            System.out.println("The 'Bill Pay' item is not displayed on the page.");
		        }

		        // Close the browser window
		        driver.quit();

	}

}
