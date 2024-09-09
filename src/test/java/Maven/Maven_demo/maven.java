package Maven.Maven_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;




public class maven {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\Automation\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://qavbox.github.io/demo/signup/");
		//driver.manage().window().minimize();
		//driver.navigate().forward();
		
		
		driver.findElement(By.name("uname")).sendKeys("amrutha");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("ammu@123");
		
		WebElement telephone = driver.findElement(By.id("tel"));
		telephone.sendKeys("9768543327");
		
		WebElement fileupload = driver.findElement(By.xpath("//*[@id=\"container\"]/div[6]/input"));
		fileupload.sendKeys("C:\\Users\\dell\\Downloads\\facebook ide.side");
		Thread.sleep(5000);
		
		//create a select object and pass the dropdown element to it
		Select dropdown = new Select(driver.findElement(By.name("sgender")));
		//dropdown.selectByVisibleText("Male");
		//dropdown.selectByValue("male");
		dropdown.selectByIndex(1);
		
		WebElement yoe1 = driver.findElement(By.cssSelector("#container > div:nth-child(17) > input[type=radio]:nth-child(4)"));
		yoe1.click();
		
		WebElement skills = driver.findElement(By.xpath("//*[@value= 'manualtesting' ]"));
		skills.click();
		WebElement skill = driver.findElement(By.xpath("//*[@value='automationtesting' ]"));
		skill.click();
		
		WebElement selenium = driver.findElement(By.xpath("//*[@value= 'selenium']"));
		selenium.click();
		
		
		
		
		WebElement submit = driver.findElement(By.id("submit"));
	    submit.click();

		driver.close();
		//driver.quit();
	}

}
