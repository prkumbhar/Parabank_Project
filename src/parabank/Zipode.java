package parabank;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Zipode {

	public static void main(String[] args) {

		//set the path to the chrome driver to be executable
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\selenuim jars\\chromedriver_win32\\chromedriver.exe");

		//create new instance of the ChromeDriver
		WebDriver driver = new ChromeDriver();
		
		//navigate to the parabank web application
		driver.get("https://parabank.parasoft.com/parabank/index.html");
		
		//log in to the web application
				WebElement username =driver.findElement(By.name("username"));
				username.sendKeys("priyark01");
				WebElement password = driver.findElement(By.name("password"));
				password.sendKeys("priya1234");
				WebElement loginButton = driver.findElement(By.cssSelector("input[type='submit']"));
		
		// Find the zip code field and enter a valid zip code
        WebElement zipCodeField = driver.findElement(By.name("zipCode"));
        zipCodeField.sendKeys("12345");

        // Verify that the zip code was entered correctly
        String enteredZipCode = zipCodeField.getAttribute("value");
        if (enteredZipCode.equals("12345")) {
            System.out.println("Zip code entered successfully");
        } else {
            System.out.println("Failed to enter zip code");
        }
	}

}
