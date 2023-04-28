package parabank;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CityField {

	public static void main(String[] args) {
		//set the path to the chrome driver executable
				System.setProperty("webdriver.chrome.driver\\", \\"\"C:\\Users\\hp\\Desktop\\selenuim jars\\chromedriver_win32\\chromedriver.exe");
				
				// create a new instance of the ChromeDriver
				WebDriver driver = new ChromeDriver();
				
				// navigate to the parabank web aplication
				driver.get("https://parabank.parasoft.com/parabank/index.html");
				
				// log in to the web application
				WebElement username =driver.findElement(By.name("username"));
				username.sendKeys("priyark01");
				WebElement password = driver.findElement(By.name("password"));
				password.sendKeys("priya1234");
				WebElement loginButton = driver.findElement(By.cssSelector("input[type='submit']"));
				
				// navigate to the update contact info
				WebElement updateContactInfoLink = driver.findElement(By.linkText("update contact Info"));
				updateContactInfoLink.click();
	
				 // Verify that the city field is enabled and displayed
		        if (cityField.isEnabled() && cityField.isDisplayed()) {
		        	
		            // Type a value into the city field
		            cityField.sendKeys("Pune");

		            // Verify that the value was entered correctly
		            String cityFieldValue = cityField.getAttribute("value");
		            if (cityFieldValue.equals("Pune")) {
		                System.out.println("City field test passed");
		            } else {
		                System.out.println("City field test failed");
		            }
		        } else {
		            System.out.println("City field is not enabled or displayed");
		        }

		        // Close the browser
		        driver.quit();
				
	}

}
