package users;

import io.restassured.response.Response;
import org.testng.IResultMap;
import users.create.CreateUserRequestBody;
import users.create.response.CreateUserErrorResponse;
import users.create.response.CreateUserResponse;
import users.deletePostById.DeletePostByIdTests;
import users.deletePostById.response.DeletePostByIdResponse;
import users.deletePostById.response.GetAllPostsResponse;
import users.getAll.GetAllUsersResponse;
import users.getAllUsersAccount.GetAllUsersAccountResponse;
import users.getPostByPostId.response.GetPostByIdResponse;

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
    public GetPostByIdResponse getPostById(String post_id) {
        Response response = new UsersClient().getPostById( post_id);
        int statusCode = response.statusCode();
        GetPostByIdResponse getPostByIdResponse = response.as(GetPostByIdResponse.class);
        getPostByIdResponse.setStatusCode(statusCode);
        return getPostByIdResponse;
    }
    public GetAllPostsResponse getAllPosts()
    {
        Response response = new UsersClient().getAllPosts();
        int statusCode = response.statusCode();
        GetAllPostsResponse getAllPostsResponse = response.as(GetAllPostsResponse.class);
        getAllPostsResponse.setStatusCode(statusCode);
        return getAllPostsResponse;
    }
    public DeletePostByIdResponse deletePostById(String delete_postId)
    {
        Response response = new UsersClient().deletePostById(delete_postId);
              int statusCode =   response.statusCode();
              DeletePostByIdResponse deletePostByIdResponse = response.as(DeletePostByIdResponse.class);
              deletePostByIdResponse.setStatusCode(statusCode);
              return deletePostByIdResponse;

    }
}
