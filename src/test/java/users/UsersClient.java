package users;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import users.create.CreateUserRequestBody;
import users.create.response.CreateUserErrorResponse;
import users.create.response.CreateUserResponse;
import users.getAll.GetAllUsersResponse;
import users.getAllUsersAccount.GetAllUsersAccountResponse;

import static io.restassured.RestAssured.given;

public class UsersClient {
    public CreateUserResponse createUser(CreateUserRequestBody body) {

        Response response =   create(body);
        CreateUserResponse createUserResponse = response.as(CreateUserResponse.class);
        createUserResponse.setStatusCode(response.statusCode());
        return createUserResponse;
    }
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

    public GetAllUsersResponse getAllUsers() {
        Response response = given()
                .header("app-id", "633d7f032ba989d7422d72b8")
                .when()
                .get("https://dummyapi.io/data/v1/user?limit=10");
        response.then()
                .log()
                .body();
        int statusCode = response.statusCode();
        GetAllUsersResponse getAllUsersResponse = response.as(GetAllUsersResponse.class);
       getAllUsersResponse.setStatusCode(statusCode);
        return getAllUsersResponse;
    }
    public CreateUserErrorResponse createUserExpectingError (CreateUserRequestBody body){
        Response response = create(body);
        CreateUserErrorResponse errorResponse = response.as(CreateUserErrorResponse.class);
        errorResponse.setStatuscode(response.statusCode());
        return errorResponse;
    }
    public GetAllUsersAccountResponse getAllUsersAccount() {
        Response response = given()
                .header("app-id", "633d7f032ba989d7422d72b8")
                .when()
                .get("https://dummyapi.io/data/v1/user?created=1");
        response.then()
                .log()
                .body();
        int statusCode = response.statusCode();
        GetAllUsersAccountResponse getAllUsersAccountResponse = response.as(GetAllUsersAccountResponse.class);
        getAllUsersAccountResponse.setStatusCode(statusCode);
        return getAllUsersAccountResponse;
    }


}
