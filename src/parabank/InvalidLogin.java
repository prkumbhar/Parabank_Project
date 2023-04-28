package parabank;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLogin {

	public static void main(String[] args) {
		
		        // Set the path to the chromedriver executable
		        System.setProperty("webdriver.chrome.driver\",\"C:\\Users\\hp\\Desktop\\selenuim jars\\chromedriver_win32\\chromedriver.exe");

		        // Create a new instance of the ChromeDriver
		        WebDriver driver = new ChromeDriver();

		        // Navigate to the login page of the application
		        driver.get("https://parabank.parasoft.com/parabank/index.htm");

		        // Enter invalid user credentials
		        String invalidUsername = "invalid_username";
		        String invalidPassword = "invalid_password";
		        driver.findElement(By.id("username")).sendKeys(priya);
		        driver.findElement(By.id("password")).sendKeys(1234546);
		        driver.findElement(By.id("login-btn")).click();

		        // Verify that login failed by checking if an error message is displayed
		        String errorMessage = "Invalid username or password";
		        if (driver.getPageSource().contains(errorMessage)) {
		            System.out.println("Login failed with invalid credentials: " + invalidUsername + "/" + invalidPassword);
		        } else {
		            System.out.println("Login succeeded with invalid credentials!");
		        }

		        // Close the browser 
		        driver.quit();
		    }
		}

	


