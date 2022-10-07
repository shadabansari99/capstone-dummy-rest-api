package users.createAPost;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import users.UsersService;
import users.create.CreateUserRequestBody;
import users.create.response.CreateUserResponse;
import users.createAPost.response.CreateAPostResponse;

public class CreateAPostTests {
    private UsersService usersService;
    @BeforeClass
    public void beforeClass()
    {
        usersService = new UsersService();
    }
    @Test
    public void shouldCreateAPost(){
        //Arrange
        CreateAPostRequestBody requestBody =  new CreateAPostRequestBody.Builder().build();
        //Act
        CreateAPostResponse createAPostResponse = usersService.createPost(requestBody);

        //Assert
        createAPostResponse.assertPostCreate(requestBody);
    }
}

