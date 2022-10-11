package user.getAllUsersAccount;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import user.UsersService;
import user.getAllUsersAccount.response.GetAllUsersAccountResponse;

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
