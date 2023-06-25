package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginSteps {
  @Given("^User input (.*) in email field$")
  public void userInputEmailFields(String email){
   System.out.println(email);
  }


 @When("^User input (.*) in password field$")
 public void userInputInPasswordField(String password) {
  System.out.println(password);
 }

 @And("User click submit button")
 public void userClickSubmitButton() {
  System.out.println("clickButton");
 }

 @Then("User redirected to homepage")
 public void userRedirectedToHomepage() {
  System.out.println("userRedirected to homepage");
 }

 @Then("User able to see toaster error")
 public void userAbleToSeeToasterError() {
  System.out.println("see toaster error");
 }
}
