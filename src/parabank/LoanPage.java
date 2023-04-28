package parabank;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoanPage {

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
		        
		     // Verify that the Request Loan page is displayed
		        String expectedTitle = "ParaBank | Request Loan";
		        String actualTitle = driver.getTitle();
		        if (actualTitle.equals(expectedTitle)) {
		            System.out.println("Request Loan page is displayed");
		        } else {
		            System.out.println("Failed to display Request Loan page");
		        }

		        // Close the browser window
		        driver.quit();
				
				
	}

}
