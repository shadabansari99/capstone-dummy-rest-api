import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import users.UsersClient;
import users.getAllUsersAccount.GetAllUsersAccountResponse;

public class GetAllUsersUnderAccountTests {
    //Arrange
    private UsersClient usersClient;

    @BeforeClass
    public void beforeClass()
    {
        usersClient = new UsersClient();
    }
    @Test
    public void shouldGetAllUsersUnderAccount()
    {
        //Act
        GetAllUsersAccountResponse getAllUsersAccountResponse = usersClient.getAllUsersAccount();

        //Assert
        Assert.assertEquals(getAllUsersAccountResponse.getStatusCode(),200);
        Assert.assertEquals(getAllUsersAccountResponse.getDataList().size(),getAllUsersAccountResponse.getTotal());

    }

}
