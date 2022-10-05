import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import users.UsersClient;
import users.create.CreateUserRequestBody;
import users.create.response.CreateUserErrorResponse;

import static org.testng.AssertJUnit.assertEquals;

public class CreateUserNegativeTests {
    private UsersClient usersClient;
    @BeforeClass
    public void beforeClass()
    {
        usersClient = new UsersClient();
    }

    @Test
    public void shouldNotAllowToCreateUserWithExistingEmail()
    {
        //Arrange

        CreateUserRequestBody requestBody = new CreateUserRequestBody.Builder().email("shadab1@gmail.com").build();
        //Act
        CreateUserErrorResponse errorResponse = usersClient.createUserExpectingError(requestBody);

        //Assert
        assertEquals(errorResponse.getStatuscode(),400);
        assertEquals(errorResponse.getError(),"BODY_NOT_VALID");
        assertEquals(errorResponse.getData().getEmail(),"Email already used");
    }
}
