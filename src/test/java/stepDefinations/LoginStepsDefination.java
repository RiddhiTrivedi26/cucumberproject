package stepDefinations;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;




public class LoginStepsDefination {
	LoginPage lp=new LoginPage();
	
	@Given("^User is already on Login Page$")
	public void user_is_already_on_Login_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		System.out.println("Step1: User is already on Login Page");
		lp.openBrowser();
	    lp.openLoginPage();
	}

	@When("^title of login page is \"([^\"]*)\"$")
	public void title_of_login_page_is(String title) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Step2:title of login page is Sign in | Scotiabank");
		System.out.println(title);
		   String expectedTitle=title;
		   String acutalTitle=lp.getTitle();
		   Assert.assertEquals(expectedTitle, acutalTitle);
	}

	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String email, String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		System.out.println("Step3:User enters emailid and password");
		lp.enterEmialandPassword(email, password);
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Step4:User click on login Button");
		 lp.clickOnLoginButton();
		
	}

	@Then("^user get global error$")
	public void user_get_global_error() throws Throwable {
	    System.out.println("Step5:User get the error");
	    String expectedErrMsg="Please enter a username or card number without special characters.";
		String actualErrMsg= lp.readError();
		System.out.println(actualErrMsg);
		Assert.assertEquals(expectedErrMsg, actualErrMsg);
	}

	@Then("^user quit$")
	public void user_quit() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Step6:User quit");
		lp.closeBrowser();
	}	

}
