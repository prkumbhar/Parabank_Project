package parabank;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {
		
		        // Set the path to the chromedriver executable
		        System.setProperty("webdriver.chrome.driver\",\"C:\\Users\\hp\\Desktop\\selenuim jars\\chromedriver_win32\\chromedriver.exe");

		        // Create a new instance of the ChromeDriver
		        WebDriver driver = new ChromeDriver();

		        // Navigate to the login page of the application
		        driver.get("https://parabank.parasoft.com/parabank/index.htm");

		        // Enter valid user credentials
		        driver.findElement(By.id("username")).sendKeys("prkumbhar");
		        driver.findElement(By.id("password")).sendKeys("priya1234");
		        driver.findElement(By.id("login-btn")).click();

		        // Verify that user is logged in by checking if the dashboard page is loaded
		        if (driver.getCurrentUrl().equals("https://parabank.parasoft.com/parabank/login.htm")) {
		            System.out.println("User has logged in successfully!");
		        } else {
		            System.out.println("Login failed!");
		        }

		        // Close the browser window
		        driver.quit();
		    }
		}



