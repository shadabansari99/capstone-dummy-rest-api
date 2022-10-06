package users.getPostByPostId;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import users.UsersService;
import users.getPostByPostId.response.GetPostByIdResponse;

public class GetPostByPostIdTests {
    private UsersService usersService;

    @BeforeClass
    public void beforeClass()
    {
        usersService = new UsersService();
    }

    @Test
    public void shouldGetPostByPostId(){
        String post_id = "60d21b4967d0d8992e610c90";
        GetPostByIdResponse getPostByIdResponse = usersService.getPostById(post_id);
        Assert.assertEquals(getPostByIdResponse.getStatusCode(),200);
        Assert.assertEquals(getPostByIdResponse.getId(),post_id);


    }
}
