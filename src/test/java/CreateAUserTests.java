import org.testng.annotations.Test;
import users.UsersClient;
import users.create.CreateUserRequestBody;
import users.create.response.CreateUserResponse;

public class CreateAUserTests {
    @Test
    public void shouldCreateAUser()
    {
        //Arrange
        CreateUserRequestBody requestBody = new CreateUserRequestBody.Builder().build();
        //Act
        CreateUserResponse createUserResponse = new UsersClient().createUser(requestBody);

        //Assert
        createUserResponse.assertUser(requestBody);

    }
}
