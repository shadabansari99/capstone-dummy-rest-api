package post.getPostByPostId;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import post.PostsService;
import user.UsersService;
import post.getPostByPostId.response.GetPostByIdResponse;

public class GetPostByPostIdTests {
    private PostsService postsService;
    @BeforeClass
    public void beforeClass()
    {
        postsService = new PostsService();
    }
    @Test
    public void shouldGetPostByPostId(){
        String post_id = "60d21b7f67d0d8992e610d2b";
        GetPostByIdResponse getPostByIdResponse = postsService.getPostById(post_id);
        Assert.assertEquals(getPostByIdResponse.getStatusCode(),200);
        Assert.assertEquals(getPostByIdResponse.getId(),post_id);


    }
}
