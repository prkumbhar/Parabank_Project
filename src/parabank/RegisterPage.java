package parabank;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterPage {

	public static void main(String[] args) {
		

		        // Set the path of the chromedriver.exe file
		        System.setProperty("webdriver.chrome.driver\\",\\"C:\\Users\\hp\\Desktop\\selenuim jars\\chromedriver_win32\\chromedriver.exe");
		        
		        // Create a new instance of the ChromeDriver
		        WebDriver driver = new ChromeDriver();
		        
		        // Navigate to the ParaBank registration page
		        driver.get("https://parabank.parasoft.com/parabank/register.htm");
		        
		        // Fill in the registration form fields
		        WebElement firstName = driver.findElement(By.name("customer.firstName"));
		        firstName.sendKeys("priya");
		        
		        WebElement lastName = driver.findElement(By.name("customer.lastName"));
		        lastName.sendKeys("kumbhar");
		        
		        WebElement address = driver.findElement(By.name("customer.address.street"));
		        address.sendKeys("wagholi");
		        
		        WebElement city = driver.findElement(By.name("customer.address.city"));
		        city.sendKeys("pune");
		        
		        WebElement state = driver.findElement(By.name("customer.address.state"));
		        state.sendKeys("maharashtra");
		        
		        WebElement zipCode = driver.findElement(By.name("customer.address.zipCode"));
		        zipCode.sendKeys("12345");
		        
		        WebElement phoneNumber = driver.findElement(By.name("customer.phoneNumber"));
		        phoneNumber.sendKeys("7387757136");
		        
		        WebElement ssn = driver.findElement(By.name("customer.ssn"));
		        ssn.sendKeys("123-45-6789");
		        
		        WebElement username = driver.findElement(By.name("customer.username"));
		        username.sendKeys("prkumbhar");
		        
		        WebElement password = driver.findElement(By.name("customer.password"));
		        password.sendKeys("priya1234");
		        
		        WebElement confirmPassword = driver.findElement(By.name("repeatedPassword"));
		        confirmPassword.sendKeys("priya1234");
		        
		        // Submit the registration form
		        WebElement registerButton = driver.findElement(By.className("button"));
		        registerButton.click();
		        
		        // Verify that the user has been successfully registered
		        WebElement welcomeMessage = driver.findElement(By.xpath("//h1[contains(text(), 'Welcome')]"));
		        String message = welcomeMessage.getText();
		        
		        if(message.contains("Welcome")) {
		            System.out.println("User has been successfully registered!");
		        } else {
		            System.out.println("Registration failed!");
		        }
		        
		        // Close the browser
		        driver.quit();

	}

}
