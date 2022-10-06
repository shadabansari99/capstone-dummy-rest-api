package users.deletePostById;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import users.UsersService;
import users.deletePostById.response.DeletePostByIdResponse;
import users.deletePostById.response.GetAllPostsResponse;

public class DeletePostByIdTests {
    private UsersService usersService;

    @BeforeClass
    public void beforeClass()
    {
        usersService = new UsersService();
    }

    @Test
    public void shouldDeletePostById(){

        GetAllPostsResponse getAllPostsResponse = usersService.getAllPosts();


        String deletePostId= getAllPostsResponse.getData().get(0).getId();
        DeletePostByIdResponse deletePostByIdResponse = usersService.deletePostById(deletePostId);
        //Assert
        Assert.assertEquals(getAllPostsResponse.getStatusCode(),200);

    }


}
