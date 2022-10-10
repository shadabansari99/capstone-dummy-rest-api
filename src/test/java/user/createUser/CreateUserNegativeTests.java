package user.createUser;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import user.UsersService;
import user.createUser.response.CreateUserErrorResponse;


public class CreateUserNegativeTests {
    private UsersService usersService;
    @BeforeClass
    public void beforeClass()
    {
        usersService = new UsersService();
    }

    @Test
    public void shouldNotAllowToCreateUserWithExistingEmail()
    {
        //Arrange
        CreateUserRequestBody requestBody = new CreateUserRequestBody.Builder().email("shadab1@gmail.com").build();
        //Act
        CreateUserErrorResponse errorResponse = usersService.createUserExpectingError(requestBody);
        //Assert
        errorResponse.assertUserNegative(requestBody);

    }
}
