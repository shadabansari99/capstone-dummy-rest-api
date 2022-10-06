import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import users.UsersClient;
import users.UsersService;
import users.create.CreateUserRequestBody;
import users.create.response.CreateUserResponse;

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
