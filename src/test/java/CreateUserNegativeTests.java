import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import users.UsersClient;
import users.UsersService;
import users.create.CreateUserRequestBody;
import users.create.response.CreateUserErrorResponse;

import static org.testng.AssertJUnit.assertEquals;

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
        assertEquals(errorResponse.getStatuscode(),400);
        assertEquals(errorResponse.getError(),"BODY_NOT_VALID");
        assertEquals(errorResponse.getData().getEmail(),"Email already used");
    }
}
