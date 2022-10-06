package users.deletePostById;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import users.UsersService;
import users.deletePostById.response.GetAllPostsResponse;
import users.getAll.GetAllUsersResponse;

public class GetAllPostsTests {
    private UsersService usersService;

    @BeforeClass
    public void beforeClass()
    {
        usersService = new UsersService();
    }

    @Test
    public void shouldGetAllPosts(){
        GetAllPostsResponse getAllPostsResponse = usersService.getAllPosts();

        //Assert
        Assert.assertEquals(getAllPostsResponse.getStatusCode(),200);
        String deletePostId;
        deletePostId = getAllPostsResponse.getData().get(0).getId();


    }

}
