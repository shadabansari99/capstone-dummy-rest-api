package post.getPostByPostId;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import post.PostsService;
import post.getPostByPostId.response.GetPostByIdResponse;

public class GetPostByPostIdTests {
    //Arrange
    private PostsService postsService;
    @BeforeClass
    public void beforeClass()
    {
        postsService = new PostsService();
    }
    @Test
    public void shouldGetPostByPostId(){
        //Arrange
        String post_id = "60d21b7f67d0d8992e610d2b";
        //Act
        GetPostByIdResponse getPostByIdResponse = postsService.getPostById(post_id);
        //Assert
        Assert.assertEquals(getPostByIdResponse.getStatusCode(),200);
        Assert.assertEquals(getPostByIdResponse.getId(),post_id);


    }
}
