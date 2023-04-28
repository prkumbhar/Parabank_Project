package parabank;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstName {

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

		        // Enter the first name into the input field
		        WebElement firstNameInput = driver.findElement(By.name("customer.firstName"));
		        firstNameInput.sendKeys("priya");

		        // Check if the first name was entered successfully
		        String enteredFirstName = firstNameInput.getAttribute("value");
		        if (enteredFirstName.equals("John")) {
		            System.out.println("The user was able to type in their first name.");
		        } else {
		            System.out.println("The user was not able to type in their first name.");
		        }

		       

		        // Close the browser window
		        driver.quit();
		    
	}

}
