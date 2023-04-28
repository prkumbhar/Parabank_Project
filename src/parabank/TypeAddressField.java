package parabank;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TypeAddressField {

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
		
		// click on address text field
		WebElement addressInput = driver.findElement(By.name("address"));
		addressInput.sendKeys("pune");
		
		//check the address text field was entered successfully
		String enteredAddress =addressInput.getAttribute("value");
		if (enteredAddress.equals("pune")) {
            System.out.println("The user was able to type in their address field.");
        } else {
            System.out.println("The user was not able to type in their address field.");
        }
		
		// close the browser
		driver.quite();
		
		
		
	}

}
