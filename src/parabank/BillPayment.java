package parabank;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BillPayment {

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

		        // Navigate to the Bill Pay page
		        WebElement billPayLink = driver.findElement(By.linkText("Bill Pay"));
		        billPayLink.click();

		        // Enter payment details
		        WebElement payeeName = driver.findElement(By.name("payee.name"));
		        payeeName.sendKeys("priya k");
		        WebElement payeeAddress = driver.findElement(By.name("payee.address.street"));
		        payeeAddress.sendKeys("wagholi");
		        WebElement payeeCity = driver.findElement(By.name("payee.address.city"));
		        payeeCity.sendKeys("pune");
		        WebElement payeeState = driver.findElement(By.name("payee.address.state"));
		        payeeState.sendKeys("maharashtra");
		        WebElement payeeZip = driver.findElement(By.name("payee.address.zipCode"));
		        payeeZip.sendKeys("12345");
		        WebElement payeePhone = driver.findElement(By.name("payee.phoneNumber"));
		        payeePhone.sendKeys("7387757136");
		        WebElement accountNumber = driver.findElement(By.name("payee.accountNumber"));
		        accountNumber.sendKeys("13899");
		        WebElement verifyAccountNumber = driver.findElement(By.name("verifyAccount"));
		        verifyAccountNumber.sendKeys("13899");
		        WebElement amount = driver.findElement(By.name("amount"));
		        amount.sendKeys("100");
		        WebElement submitButton = driver.findElement(By.cssSelector("input[type='submit']"));
		        submitButton.click();

		        // Check if the payment was successful
		        WebElement successMessage = driver.findElement(By.xpath("//span[contains(text(),'Bill Payment Complete')]"));
		        if (successMessage.isDisplayed()) {
		            System.out.println("Payment was successfully sent to another account.");
		        } else {
		            System.out.println("Payment was not sent successfully.");
		        }

		        // Log out of the web application
		        WebElement logoutLink = driver.findElement(By.linkText("Log Out"));
		        logoutLink.click();

		        // Close the browser 
		        driver.quit();
		    }
		}

