package parabank;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApplyNowButton {

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
        
     // Find the Loan Amount, Down Payment and Account Number fields and enter values
        WebElement loanAmountField = driver.findElement(By.name("amount"));
        loanAmountField.sendKeys("1000");
        WebElement downPaymentField = driver.findElement(By.name("downPayment"));
        downPaymentField.sendKeys("100");
        WebElement accountNumberField = driver.findElement(By.name("account"));
        accountNumberField.sendKeys("13788");

        // Find the Apply Now button and check if it is clickable
        WebElement applyNowButton = driver.findElement(By.cssSelector(".button[value='Apply Now']"));
        boolean isClickable = applyNowButton.isEnabled();
        if (isClickable) {
            System.out.println("Apply Now button is clickable");
        } else {
            System.out.println("Apply Now button is not clickable");
        }

        // Close the browser window
        driver.quit();
	}

}
