package user;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import user.createUser.CreateUserRequestBody;

import static io.restassured.RestAssured.given;

public class UsersClient {

    public Response create(CreateUserRequestBody body) {
        Response response = given()
                .header("app-id", "633d7f032ba989d7422d72b8")
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .body(body)
                .when()
                .post("https://dummyapi.io/data/v1/user/create");


        response.then().log().body();
        return response;
    }
    public static Response getAllUser() {
        Response response = given()
                .header("app-id", "633d7f032ba989d7422d72b8")
                .when()
                .get("https://dummyapi.io/data/v1/user?limit=10");
        response.then()
                .log()
                .body();
        return response;
    }
    public static Response getAll() {
        Response response = given()
                .header("app-id", "633d7f032ba989d7422d72b8")
                .when()
                .get("https://dummyapi.io/data/v1/user?created=1");
        response.then()
                .log()
                .body();
        return response;
    }

}
