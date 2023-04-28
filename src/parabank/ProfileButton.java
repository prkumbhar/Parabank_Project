package parabank;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProfileButton {

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
		
		// Find the update profile button and check if it is clickable
        WebElement updateProfileButton = driver.findElement(By.linkText("Update Profile"));
        boolean isClickable = updateProfileButton.isEnabled();
        if (isClickable) {
            System.out.println("Update Profile button is clickable");
        } else {
            System.out.println("Update Profile button is not clickable");
        }
        
     // Close the browser window
        driver.quit();
	}

}
