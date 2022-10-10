package post.deletePostById;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import post.PostsService;
import post.deletePostById.response.GetAllPostsResponse;

public class GetAllPostsTests {
    private PostsService postsService;
    @BeforeClass
    public void beforeClass()
    {
        postsService = new PostsService();
    }

    @Test
    public void shouldGetAllPosts(){
        GetAllPostsResponse getAllPostsResponse = postsService.getAllPosts();

        //Assert
        Assert.assertEquals(getAllPostsResponse.getStatusCode(),200);



    }

}
