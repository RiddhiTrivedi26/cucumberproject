package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage{
	
	WebDriver driver;
	
	public void openBrowser() {
		 System.setProperty("webdriver.gecko.driver","/Users/jaydave/seleniumjar/geckodriver");
			driver=new FirefoxDriver();
	}
	public void openLoginPage() {
		driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=J2Jn5H04Pig&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5zY290aWFiYW5rLmNvbVwvIiwib2F1dGhfa2V5IjoiSjJKbjVIMDRQaWciLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6XC9cL3d3dy5zY290aWFvbmxpbmUuc2NvdGlhYmFuay5jb21cL29ubGluZVwvbGFuZGluZ1wvb2F1dGhsYW5kaW5nLmJucyIsImV4cCI6MTY0NDUyMDgxMywiaWF0IjoxNjQ0NTE5NjEzLCJqdGkiOiJkNzMzMDk5Ni0wYmY5LTQ0MjEtYjM4OC0xN2ZiZDRjYTY4MTEiLCJjbGllbnRfaWQiOiI4ZWU5MGMzOS0xYzUyLTRmZjQtOGFlNi1hN2I1NGM1Mzk5MzMiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiU09MIiwiQXBwbGljYXRpb25Db2RlIjoiSDcifSwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.Dygk2xJEEx69W7sVDyPv5ZLGW8_kdtz4Ngf1x4N58kibC7xwYwxd24M_pMKcqJsB5sna4UfuzjCXBY0CqPMStTDhi5-SYP2RP9ZkG9mXJsFGLb0-3F2_9o7gw2kZAjGBFOjTe9QIlrQbDYLkcBi5OhV1WBlyhS-dksOguCwdPRKAjoUf2MSBeef0baINXDM3yO2JIwVRj90T6y9sMpEPzRiuOnShk9fq7Nd2YSiOXT6cJoPvijO4HJPg1_44nbbhZQy7MmItdDKVvGavXWGRn-eDDCoTWKfdqOpTwRUhmNRlCnUJ2-wKK48LXZFvziRtr8ztnBDRzYk9JuAQiS3sag&preferred_environment=");
		
	}
	
	public String getTitle() {
		String acutalTitle=driver.getTitle();
		   System.out.println(acutalTitle);
		   return acutalTitle;
	}
	
	public void closeBrowser() {
		driver.quit();
	}
	public void enterEmialandPassword(String a, String b) {
		driver.findElement(By.name("usernameInput")).sendKeys(a);
		driver.findElement(By.name("password")).sendKeys(b);

}
	public void clickOnLoginButton() throws InterruptedException {
		 driver.findElement(By.id("signIn")).click();
			Thread.sleep(2000);
			
	}
	public  String readError() {
		String actualErrMsg= driver.findElement(By.id("UsernameTextField__errors-usernameInput")).getText();  //just read the error msg so get text instruction.
		System.out.println(actualErrMsg);
		return actualErrMsg;
		
		
	}

}

