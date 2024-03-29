package pages;


import helper.Endpoint;
import helper.Utility;
import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.json.JSONObject;

import java.io.File;
import java.util.List;

import static helper.Models.*;
import static org.assertj.core.api.Assertions.*;

public class ApiPage {

    String setURL, global_user_id = null;
    Response res;

    public void prepareUrlFor(String url){
        switch (url) {
            case "GET_LIST_USERS":
                setURL = Endpoint.GET_LIST_USERS;
                break;
            case "CREATE_USER":
                setURL = Endpoint.CREATE_USER;
                break;
            case "DELETE_USER":
                setURL = Endpoint.DELETE_USER;
                break;
            case "UPDATE_USER":
                setURL = Endpoint.UPDATE_USER;
                break;
            case "INVALID_USER":
                setURL = Endpoint.INVALID_USER;
            default:
                System.out.println("input right url");
        }
    }
    public void hitApiGetListData() {
        res = getListUsers(setURL);
    }
    public void hitApiPostCreateNewUser() {
        res = postCreateUser(setURL);
        System.out.println(("url yang digunakan" +setURL));
    }
    public void hitApiPostCreateNewUserMin() {
        res = postCreateUserMin(setURL);
        System.out.println(res.getBody().asString());
    }
    public void hitApiPostCreateNewUserWithoutEmail() {
        res = postCreateUserWithoutEmail(setURL);
        System.out.println(res.getBody().asString());
    }
    public void validationStatusCodeShouldBe(int status_code) {
        assertThat(res.statusCode()).isEqualTo(status_code);
    }
    public void validationResponseBodyGetListUsers() {
        List<Object> id = res.jsonPath().getList("data.id");
        List<Object> title = res.jsonPath().getList("data.title");
        List<Object> firstName = res.jsonPath().getList("data.firstName");
        List<Object> lastName = res.jsonPath().getList("data.lastName");
        List<Object> picture = res.jsonPath().getList("data.picture");

        assertThat(id.get(0)).isNotNull();
        assertThat(title.get(0)).isIn("ms", "mr", "miss", "mrs");
        assertThat(firstName.get(0)).isNotNull();
        assertThat(lastName.get(0)).isNotNull();
        assertThat(picture.get(0)).isNotNull();
    }
    public void validationResponseJsonWithJSONSchema(String filename) {
        File JSONFile = Utility.getJSONSchemaFile(filename);
        res.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(JSONFile));

    }
    public void validationResponseBodyCreateUser() {
        JsonPath jsonPathEvaluator = res.jsonPath();
        String id = jsonPathEvaluator.get("id");
        String title = jsonPathEvaluator.get("title");
        String firstName = jsonPathEvaluator.get("firstName");
        String lastName = jsonPathEvaluator.get("lastName");
        String email = jsonPathEvaluator.get("email");
        String gender = jsonPathEvaluator.get("gender");

        assertThat(id).isNotNull();
        assertThat(title).isIn("ms", "mr", "miss", "mrs");
        assertThat(firstName).isNotNull();
        assertThat(lastName).isNotNull();
        assertThat(email).isNotNull();
        assertThat(gender).isIn("female", "male");

        System.out.println(res.getBody().asString());

        global_user_id = id;
    }
    public void hitApiDeleteUsers() {
        prepareUrlFor("DELETE_USER");
        res = deleteUser(setURL, global_user_id);
        System.out.println(("url yang digunakan untuk delete" + setURL + global_user_id));
        System.out.println(res.getBody().asString());
    }
    public void hitApiUpdateUsers() {
        prepareUrlFor("UPDATE_USER");
        res = updateUser(setURL, global_user_id);
        System.out.println(("url yang digunakan untuk update" + setURL + global_user_id));
        System.out.println(res.getBody().asString());
    }
    public void validationResponseBodyUpdateUser() {

        System.out.println(res.getBody().asString());
    }
    public void validationResponseBodyCreateUserMin() {
        JsonPath jsonPathEvaluator = res.jsonPath();
        String id = jsonPathEvaluator.get("id");
        String firstName = jsonPathEvaluator.get("firstName");
        String lastName = jsonPathEvaluator.get("lastName");
        String email = jsonPathEvaluator.get("email");

        assertThat(id).isNotNull();
        assertThat(firstName).isNotNull();
        assertThat(lastName).isNotNull();
        assertThat(email).isNotNull();

    }
    public void hitApiDeleteInvalidUser() {
        prepareUrlFor("INVALID_USER");
        res = deleteInvalidUser(setURL);
        System.out.println(("url yang digunakan" + setURL));
        System.out.println(res.getBody().asString());
    }


}
