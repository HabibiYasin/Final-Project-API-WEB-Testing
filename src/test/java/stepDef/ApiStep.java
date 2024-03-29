package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.ApiPage;


public class ApiStep {
    ApiPage apiPage;
    public ApiStep() {
        this.apiPage = new ApiPage();
    }

    @Given("prepare url for {string}")
    public void prepareUrlFor(String url) {
        apiPage.prepareUrlFor(url);
    }

    @And("hit api get list data")
    public void hitApiGetListData() {
        apiPage.hitApiGetListData();
    }

    @Then("validation status code should be {int}")
    public void validationStatusCodeShouldBe(int status_code) {
        apiPage.validationStatusCodeShouldBe(status_code);
    }

    @Then("validation response body get list users")
    public void validationResponseBodyGetListUsers() {
        apiPage.validationResponseBodyGetListUsers();
    }

    @Then("validation response json with JSONSchema {string}")
    public void validationResponseJsonWithJSONSchema(String filename) {
        apiPage.validationResponseJsonWithJSONSchema(filename);
    }


    @And("hit api post create new user")
    public void hitApiPostCreateNewUser() {
        apiPage.hitApiPostCreateNewUser();
    }

    @Then("validation response body post create new user")
    public void validationResponseBodyPostCreateNewUser() {
        apiPage.validationResponseBodyCreateUser();
    }

    @And("hit api post create new user min")
    public void hitApiPostCreateNewUserMin() {
        apiPage.hitApiPostCreateNewUserMin();
    }

    @Then("validation response body post create new user min")
    public void validationResponseBodyPostCreateNewUserMin() {
        apiPage.validationResponseBodyCreateUserMin();
    }

    @And("hit api post create new user without email")
    public void hitApiPostCreateNewUserWithoutEmail() {
        apiPage.hitApiPostCreateNewUserWithoutEmail();
    }

    @And("hit api delete new")
    public void hitApiDeleteNew() {
        apiPage.hitApiDeleteUsers();
    }

    @And("hit api update data")
    public void hitApiUpdateData() {
        apiPage.hitApiUpdateUsers();
    }

    @Then("validation response body update user")
    public void validationResponseBodyUpdateUser() {
        apiPage.validationResponseBodyUpdateUser();
    }

    @And("hit api delete")
    public void hitApiDelete() { apiPage.hitApiDeleteInvalidUser();}
}
