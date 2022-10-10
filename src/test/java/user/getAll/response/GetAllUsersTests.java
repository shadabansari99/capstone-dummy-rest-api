package user.getAll.response;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import user.UsersService;
import user.getAll.GetAllUsersResponse;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;

public class GetAllUsersTests {

    //Arrange
    private UsersService usersService;
    @BeforeClass
    public void beforeClass()
    {
        usersService = new UsersService();
    }

    @Test
    public void shouldGetAllUsers()
    {
        //Act
        GetAllUsersResponse getAllUsersResponse = usersService.getAllUsers();

        //Assert
        Assert.assertEquals(getAllUsersResponse.getStatusCode(),200);
        Assert.assertEquals(getAllUsersResponse.getDataList().size(),10);

    }




}
