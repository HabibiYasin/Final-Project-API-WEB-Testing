package helper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;

import static helper.Utility.generateRandomEmail;

public class Models {
    private static RequestSpecification request;
    public static void setupHeaders() {
        request = RestAssured.given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("app-id","65fff2be62a5f22abbfaab2b");
    }
    public static Response getListUsers(String endpoint) {
        setupHeaders();
        return request.when().get(endpoint);
    }
    public static Response postCreateUser(String endpoint){
        String title = "mr";
        String firstName = "Habibi";
        String lastName = "Yasin";
        String gender = "male";
        String email = generateRandomEmail();
        String dateOfBirth = "1994-02-07";
        String phone = "081996422305";
        JSONObject payload = new JSONObject();
        payload.put("title", title);
        payload.put("firstName", firstName);
        payload.put("lastName", lastName);
        payload.put("gender", gender);
        payload.put("email", email);
        payload.put("dateOfBirth", dateOfBirth);
        payload.put("phone", phone);

        setupHeaders();
        return request.body(payload.toString()).when().post(endpoint);
    }
    public static Response postCreateUserMin(String endpoint){
        String firstName = "Habibi";
        String lastName = "Yasin";
        String email = generateRandomEmail();
        JSONObject payload = new JSONObject();
        payload.put("firstName", firstName);
        payload.put("lastName", lastName);
        payload.put("email", email);

        setupHeaders();
        return request.body(payload.toString()).when().post(endpoint);
    }
    public static Response postCreateUserWithoutEmail(String endpoint){
        String firstName = "Habibi";
        String lastName = "Yasin";
        JSONObject payload = new JSONObject();
        payload.put("firstName", firstName);
        payload.put("lastName", lastName);

        setupHeaders();
        return request.body(payload.toString()).when().post(endpoint);
    }
    public static Response deleteUser(String endpoint, String user_id) {
        setupHeaders();
        String finalEndpoint = endpoint + user_id;
        return request.when().delete(finalEndpoint);
    }
    public static Response deleteInvalidUser(String endpoint) {
        setupHeaders();
        String finalEndpoint = endpoint;
        return request.when().delete(finalEndpoint);
    }
    public static Response updateUser(String endpoint, String user_id) {
        setupHeaders();

        String title = "mr";
        String firstName = "Habibi";
        String lastName = "Edit";
        String gender = "male";
        String email = "";
        String dateOfBirth = "1994-02-07T00:00:00.000Z";
        String phone = "081996422305";
        String registerDate = "";
        String updatedDate = "";
        JSONObject payload = new JSONObject();
        payload.put("title", title);
        payload.put("firstName", firstName);
        payload.put("lastName", lastName);
        payload.put("gender", gender);
        payload.put("email", email);
        payload.put("dateOfBirth", dateOfBirth);
        payload.put("phone", phone);
        payload.put("registerDate", registerDate);
        payload.put("updatedDate", updatedDate);

        String finalEndpoint = endpoint + user_id;
        return request.body(payload.toString()).when().patch(finalEndpoint);
    }
}
