package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.WebPage;
import helper.Utility;


public class WebStep {
    WebPage webPage;
    public WebStep() {
        this.webPage = new WebPage();
    }

    @Given("user go to home page")
    public void userGoToHomePage() {
        webPage.goToHomePage();
    }

    @And("user click Sign up button in home page")
    public void userClickSignUpButton1() {
        webPage.clickBtnSignUp1();
    }

    @When("user click Sign up button in Sign up page")
    public void userClickSignUpButton2() {
        webPage.clickBtnSignup2();
    }

    @And("user click Samsung galaxy s6 image")
    public void userClickSamsungGalaxySImage() { webPage.samsungS6Click();}

    @Then("user navigated to Samsung Galaxy s6 product page")
    public void userUserNavigatedToSamsungGalaxySProductPage() { webPage.validateS6Page();}

    @And("user click phones categories")
    public void userClickPhonesCategories() {webPage.clickPhoneCat();}

    @Then("user can see Nokia lumia 1520")
    public void userCanSeeNokiaLumia() {webPage.validateNokiaImg();}

    @And("user click laptops categories")
    public void userClickLaptopsCategories() {webPage.clickLaptopCat();}

    @Then("user can see Sony vaio i5")
    public void userCanSeeSonyVaioI() {webPage.validateSonyImg();}

    @And("user click moitors categories")
    public void userClickMoitorsCategories() {webPage.clickMonitorCat();}

    @Then("user can see Apple monitor 24")
    public void userCanSeeAppleMonitor() {webPage.validateAppleImg();}

    @When("user click add to cart button")
    public void clickAddToCartButton() {webPage.clickAddtoCart();}

    @Then("user can see pop up message {string}")
    public void userCanSeePopUpMessage(String expectedMessage) throws InterruptedException {
        webPage.alertMessage(expectedMessage);}

    @And("user click Cart button")
    public void userClickCartButton() {webPage.clickCartBtn();}

    @Then("user can see Samsung galaxy s6 in cart")
    public void userCanSeeSamsungGalaxySInCart() {webPage.validateS6Image2();}

    @And("user click Log in button in home page")
    public void userClickLogInButtonInHomePage() {webPage.clickBtnLogin1();}

    @And("user input username in log in {string}")
    public void userInputUsernameInLogIn(String username) {webPage.inputUsername2(username);}

    @And("user input password in log in {string}")
    public void userInputPasswordInLogIn(String pwd) {webPage.inputPwd2(pwd);}

    @When("user click Log in button in Log in page")
    public void userClickLogInButtonInLogInPage() {webPage.clickBtnLogin2();}

    @Then("user can see Wellcome {string} at top right of the page")
    public void userCanSeeWellcomeAtTopRightOfThePage(String msg) {webPage.wellcomeMessageLogin();}

    @And("user click log out button")
    public void userClickLogOutButton() {webPage.userClickLogOutButton();}

    @Then("User log out successfully")
    public void userLogOutSuccessfully() {webPage.userLogOutSuccessfully();}

    @And("user click Place Order")
    public void userClickPlaceOrder() {webPage.userClickPlaceOrder();}

    @And("user input {string} in Name")
    public void userInputInName(String name) {webPage.userInputInName(name);}

    @And("user input {string} in Country")
    public void userInputInCountry(String country) {webPage.userInputInCountry(country);}

    @And("user input {string} in City")
    public void userInputInCity(String city) {webPage.userInputInCity(city);}

    @And("user input {string} in Credit Card")
    public void userInputInCreditCard(String cc) {webPage.userInputInCreditCard(cc);}

    @And("user input {string} in Month")
    public void userInputInMonth(String month) {webPage.userInputInMonth(month);}

    @And("user input {string} in Year")
    public void userInputInYear(String year) {webPage.userInputInYear(year);}

    @And("user click purchase")
    public void userClickPurchase() {webPage.userClickPurchase();}

    @Then("user can see message Thank you for your purchase!")
    public void userCanSeeMessageThankYouForYourPurchase() {webPage.userCanSeeMessageThankYouForYourPurchase();}

    @And("user input random username")
    public void userInputRandomUsername() {
        String randomUsername = Utility.generateRandomUsername();
        webPage.inputUsername1(randomUsername);
    }

    @And("user input random password")
    public void userInputRandomPassword() {
        String randomPassword = Utility.generateRandomPassword();
        webPage.inputPwd1(randomPassword);
    }
}
