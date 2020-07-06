package stepDefinitions;
 
import org.openqa.selenium.By;

import cucumber.TestContext;
import cucumber.api.java.en.When;
import pageObjects.CheckoutPage;
 
public class CheckoutPageSteps {
	TestContext testContext;
	CheckoutPage checkoutPage;
	
	public CheckoutPageSteps(TestContext context) {
		testContext = context;
		checkoutPage = testContext.getPageObjectManager().getCheckoutPage();
	}
	
	@When("^Enter personal details on checkout page$")
	public void enter_personal_details_on_checkout_page(){
		checkoutPage.fill_PersonalDetails();	
	}
	
	@When("^Select same delivery address$")
	public void select_same_delivery_address(){
		checkoutPage.check_ShipToDifferentAddress(false);
	}
	
	@When("^Select payment method as \"([^\"]*)\" payment$")
	public void select_payment_method_as_payment(String arg1){
		checkoutPage.select_PaymentMethod(arg1);
	}
 
	@When("^Place the order$")
	public void place_the_order() {
		checkoutPage.check_TermsAndCondition(true);
		checkoutPage.clickOn_PlaceOrder();
		//testContext.getWebDriverManager().closeDriver();
	}	
 
}