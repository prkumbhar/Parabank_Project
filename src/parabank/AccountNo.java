package parabank;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccountNo {

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
		
		 // Find the Request Loan button and click it
        WebElement requestLoanButton = driver.findElement(By.linkText("Request Loan"));
        requestLoanButton.click();
        
     // Find the account number field and enter an account number
        WebElement accountNumberField = driver.findElement(By.name("account"));
        accountNumberField.sendKeys("13788");

        // Verify that the account number has been entered correctly
        String expectedAccountNumber = "13788";
        String actualAccountNumber = accountNumberField.getAttribute("value");
        if (actualAccountNumber.equals(expectedAccountNumber)) {
            System.out.println("Account number added successfully");
        } else {
            System.out.println("Failed to add account number");
        }

        // Close the browser window
        driver.quit();
	}

}
