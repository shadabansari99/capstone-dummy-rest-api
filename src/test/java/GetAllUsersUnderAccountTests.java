import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import users.UsersClient;
import users.UsersService;
import users.getAllUsersAccount.GetAllUsersAccountResponse;

public class GetAllUsersUnderAccountTests {
    //Arrange
    private UsersService usersService;
    @BeforeClass
    public void beforeClass()
    {
        usersService = new UsersService();
    }
    @Test
    public void shouldGetAllUsersUnderAccount()
    {
        //Act
        GetAllUsersAccountResponse getAllUsersAccountResponse = usersService.getAllUsersAccount();

        //Assert
        Assert.assertEquals(getAllUsersAccountResponse.getStatusCode(),200);
        Assert.assertEquals(getAllUsersAccountResponse.getDataList().size(),20);

    }

}
