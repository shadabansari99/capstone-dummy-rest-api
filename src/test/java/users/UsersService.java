package users;

import io.restassured.response.Response;
import users.create.CreateUserRequestBody;
import users.create.response.CreateUserErrorResponse;
import users.create.response.CreateUserResponse;
import users.getAll.GetAllUsersResponse;
import users.getAllUsersAccount.GetAllUsersAccountResponse;

public class UsersService {

    public CreateUserResponse createUser(CreateUserRequestBody body) {

        Response response =   new UsersClient().create(body);
        CreateUserResponse createUserResponse = response.as(CreateUserResponse.class);
        createUserResponse.setStatusCode(response.statusCode());
        return createUserResponse;
    }
    public CreateUserErrorResponse createUserExpectingError (CreateUserRequestBody body){
        Response response =  new UsersClient().create(body);
        CreateUserErrorResponse errorResponse = response.as(CreateUserErrorResponse.class);
        errorResponse.setStatuscode(response.statusCode());
        return errorResponse;
    }
    public GetAllUsersResponse getAllUsers() {
        Response response = new UsersClient().getAllUser();
        int statusCode = response.statusCode();
        GetAllUsersResponse getAllUsersResponse = response.as(GetAllUsersResponse.class);
        getAllUsersResponse.setStatusCode(statusCode);
        return getAllUsersResponse;
    }
    public GetAllUsersAccountResponse getAllUsersAccount() {
        Response response = new UsersClient().getAll();

        int statusCode = response.statusCode();
        GetAllUsersAccountResponse getAllUsersAccountResponse = response.as(GetAllUsersAccountResponse.class);
        getAllUsersAccountResponse.setStatusCode(statusCode);
        return getAllUsersAccountResponse;
    }
}
