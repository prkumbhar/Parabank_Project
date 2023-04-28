package parabank;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddressField {

	public static void main(String[] args) {
		// Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver\\",\\"C:\\Users\\hp\\Desktop\\selenuim jars\\chromedriver_win32\\chromedriver.exe");
        		

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the Parabank web application
        driver.get("https://parabank.parasoft.com/parabank/index.htm");

        // Log in to the web application
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("priyark01");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("priya1234");
        WebElement loginButton = driver.findElement(By.cssSelector("input[type='submit']"));
        loginButton.click();
        
        // Navigate to the Contact Info page
        WebElement updateContactInfoLink = driver.findElement(By.linkText("Update Contact Info"));
        updateContactInfoLink.click();
        
     // Click on the address  text field
        WebElement addressInput = driver.findElement(By.name("customer.address"));
        addressInput.click();
        
     // Check if the text cursor is visible in the address  text field
        if (addressInput.getAttribute("class").contains("caret")) {
            System.out.println("The text cursor is visible in the address text field.");
        } else {
            System.out.println("The text cursor is not visible in the address text field.");
        }

       
        // Close the browser 
        driver.quit();
        
	}

}
