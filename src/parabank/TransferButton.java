package parabank;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TransferButton {

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
		
		 // Navigate to the transfer funds page
        driver.findElement(By.linkText("Transfer Funds")).click();

        // Enter the transfer details
        WebElement fromAccountField = driver.findElement(By.name("fromAccountId"));
        fromAccountField.sendKeys("1234567890");
        WebElement toAccountField = driver.findElement(By.name("toAccountId"));
        toAccountField.sendKeys("0987654321");
        WebElement amountField = driver.findElement(By.name("amount"));
        amountField.sendKeys("100");

        // Check if the transfer button is clickable
        WebElement transferButton = driver.findElement(By.xpath("//input[@value='Transfer']"));
        if (transferButton.isEnabled()) {
            System.out.println("Transfer button is clickable!");
        } else {
            System.out.println("Error: Transfer button is not clickable.");
        }

        // Close the browser
        driver.quit();		
		
	}

}
