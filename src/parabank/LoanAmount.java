package parabank;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoanAmount {

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
        
     // Find the loan amount field and enter a loan amount
        WebElement loanAmountField = driver.findElement(By.name("amount"));
        loanAmountField.sendKeys("10000");

        // Verify that the loan amount has been entered correctly
        String expectedLoanAmount = "10000";
        String actualLoanAmount = loanAmountField.getAttribute("value");
        if (actualLoanAmount.equals(expectedLoanAmount)) {
            System.out.println("Loan amount added successfully");
        } else {
            System.out.println("Failed to add loan amount");
        }

        // Close the browser window
        driver.quit();.
	}

}
