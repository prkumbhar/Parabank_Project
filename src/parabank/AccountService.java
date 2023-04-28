package parabank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccountService {

	public static void main(String[] args) {
		

		        // Set the path to the chromedriver executable
		        System.setProperty("webdriver.chrome.driver\\",\\"C:\\Users\\hp\\Desktop\\selenuim jars\\chromedriver_win32\\chromedriver.exe");

		        // Create a new instance of the ChromeDriver
		        WebDriver driver = new ChromeDriver();

		        // Navigate to the ParaBank login page
		        driver.get("https://parabank.parasoft.com/parabank/index.htm");

		        // Find the "Account Services" link and click it
		        WebElement accountServicesLink = driver.findElement(By.linkText("Account Services"));
		        accountServicesLink.click();

		        // Find the menu item element and verify that it is displayed
		        WebElement menuItem = driver.findElement(By.xpath("//div[@id='leftPanel']//a[contains(text(),'Request Check')]"));
		        if (menuItem.isDisplayed()) {
		            System.out.println("Menu item is displayed");
		        } else {
		            System.out.println("Menu item is not displayed");
		        }

		        // Close the browser
		        driver.quit();

	}

}
