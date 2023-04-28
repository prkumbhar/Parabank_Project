package parabank;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class StateField {

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
		
		// navigate to the update contact info
				WebElement updateContactInfoLink = driver.findElement(By.linkText("update contact Info"));
				updateContactInfoLink.click();
				
				// Find the state field and check if it is enabled
			       boolean isStateFieldEnabled = driver.findElement(By.name("state")).isEnabled();
			       if (isStateFieldEnabled) 
			    	   
			    	   if (isStateFieldEnabled) {
			               System.out.println("User is able to type in the state field.");
			           } else {
			               System.out.println("User is not able to type in the state field.");
			           }
			    	   // close the browser
			    	   driver.quit();
			    		   
	}

}
