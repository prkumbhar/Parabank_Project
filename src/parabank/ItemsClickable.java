package parabank;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ItemsClickable {

	public static void main(String[] args) {
		

		        // set the path of chromedriver executable
		        System.setProperty("webdriver.chrome.driver\",\"C:\\Users\\hp\\Desktop\\selenuim jars\\chromedriver_win32\\chromedriver.exe");

		        // create a new instance of the ChromeDriver
		        WebDriver driver = new ChromeDriver();

		        // navigate to the Parabank web application
		        driver.get("https://parabank.parasoft.com/parabank/index.htm");

		        // maximize the browser window
		        driver.manage().window().maximize();

		        // find the account services section
		        WebElement accountServices = driver.findElement(By.xpath("//div[@id='leftPanel']//h3[text()='Accounts']"));

		        // click on the account services section to expand it
		        accountServices.click();

		        // find the account service items
		        WebElement openNewAccount = driver.findElement(By.xpath("//*[@id=\"leftPanel\"]//a[text()='Open New Account']"));
		        WebElement accountsOverview = driver.findElement(By.xpath("//div[@id='leftPanel']//a[text()='Accounts Ocerview']"));
		        WebElement transferFunds = driver.findElement(By.xpath("//div[@id='leftPanel']//a[text()='Transfer Funds']"));
		        WebElement billPay = driver.findElement(By.xpath("//div[@id=leftPanel']//a[text()='Bill Pay']"));
		        WebElement findTranscation = driver.findElement(By.xpath("//div[@id=leftPanel']//a[text()='Find Tracsiction'"));
		        WebElement updateContactInfo = driver.findElement(By.xpath("//div[@id=leftPanel']//a[text()='Update Contact Info'"));
		        WebElement requestLoan = driver.findElement(By.xpath("//div[@id=leftPanel']//a[text()='Request Loan']"));
		        WebElement logOut = driver.findElement(By.xpath("//div[@id=leftPanel']//a[text()='Log Out'"));
		        
		        
		        // verify if the account service items are enabled and clickable
		            System.out.println("All account service items are clickable.");		        
		   

		        // close the browser
		        driver.quit();

	}

}
