package parabank;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownPayment {

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
		        
		     // Find the down payment field and enter a down payment amount
		        WebElement downPaymentField = driver.findElement(By.name("downPayment"));
		        downPaymentField.sendKeys("2000");

		        // Verify that the down payment has been entered correctly
		        String expectedDownPayment = "2000";
		        String actualDownPayment = downPaymentField.getAttribute("value");
		        if (actualDownPayment.equals(expectedDownPayment)) {
		            System.out.println("Down payment added successfully");
		        } else {
		            System.out.println("Failed to add down payment");
		        }

		        // Close the browser window
		        driver.quit();
		
	}

}
