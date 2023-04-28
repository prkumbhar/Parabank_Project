package parabank;

public class EnterAmount {
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	
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
		
		// Click on the Transfer Funds link
        driver.findElement(By.linkText("Transfer Funds")).click();
        
     // Enter the amount to transfer
        WebElement amountField = driver.findElement(By.name("amount"));
        amountField.sendKeys("100.00");

        // Verify that the amount entered is correct
        String amountEntered = amountField.getAttribute("value");
        if (amountEntered.equals("100.00")) {
            System.out.println("Amount entered successfully!");
        } else {
            System.out.println("Error: Amount entered incorrectly.");
        }

        // Close the browser
        driver.quit();
	}

}
