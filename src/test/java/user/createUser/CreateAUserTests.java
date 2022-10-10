package user.createUser;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import user.UsersService;
import user.createUser.response.CreateUserResponse;

public class CreateAUserTests {
    private UsersService usersService;
    @BeforeClass
    public void beforeClass()
    {
        usersService = new UsersService();
    }
    @Test
    public void shouldCreateAUser()
    {
        //Arrange
        CreateUserRequestBody requestBody = new CreateUserRequestBody.Builder().build();
        //Act
        CreateUserResponse createUserResponse = usersService.createUser(requestBody);

        //Assert
        createUserResponse.assertUser(requestBody);

    }
}
