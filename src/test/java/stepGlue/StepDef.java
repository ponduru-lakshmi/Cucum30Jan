package stepGlue;




import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class StepDef {
	WebDriver driver;
	@Given("User navigated to login page")
	public void user_navigated_to_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver=DriverUtil.getDriver("chrome");
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	    LoginPage lp=new LoginPage(driver);
	    lp.SignIn.click();
		
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		LoginPage.Username.sendKeys("Lalitha");
		LoginPage.Password.sendKeys("password123");
	}

	@Then("user logged in successfully")
	public void user_logged_in_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	    
	} 
	    
	}
	/*@When("Larry searches for products in the search field")
	public void larry_searches_for_products_in_the_search_field(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	   // throw new io.cucumber.java.PendingException();
		
		List<String> pro_list=dataTable.asList();
		System.out.println(pro_list.size());
		
		for(String plist: pro_list) {
			driver.findElement(By .name("products")).sendKeys(plist);
			String str=driver.findElement(By .xpath("/html/body/div[1]/b")).getText();
			System.out.println(str);
			driver.findElement(By .name("products")).clear();
		}
		}

	@Then("Larry verifies the product availabiliy")
	public void larry_verifies_the_product_availabiliy() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	
	@Given("Sales executive logged into the machine")
	public void sales_executive_logged_into_the_machine111() {
	    // Write code here that turns the phrase above into concrete actions
		driver=DriverUtil.getDriver("chrome");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	    
	}
	@When("Sales executive provides {string} and {string} as credentials")
	public void sales_executive_provides_and_as_credentials1(String string,String string2) {
		driver.findElement(By .linkText("SignIn")).click();
		driver.findElement(By .name("userName")).sendKeys(string);
		driver.findElement(By .name("password")).sendKeys(string2);
		driver.findElement(By .name("Cancel")).click();
	}


	@Given("Alex is existing customer")
	public void alex_is_existing_customer() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Given("He has good purchase record with store")
	public void he_has_good_purchase_record_with_store() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("Alex provides his mobile no")
	public void alex_provides_his_mobile_no() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("Alex should get registration success")
	public void alex_should_get_registration_success() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	
	
	@Given("Alex purchased microwave for {int} dollars")
	public void alex_purchased_microwave_for_dollars(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Given("Alex has a receipt")
	public void alex_has_a_receipt() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("Alex return the faulty microwave")
	public void alex_return_the_faulty_microwave() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("Alex got refund of {int} dollars")
	public void alex_got_refund_of_dollars(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

}*/