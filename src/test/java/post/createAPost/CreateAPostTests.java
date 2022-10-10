package post.createAPost;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import post.PostsService;
import post.createAPost.response.CreateAPostResponse;

public class CreateAPostTests {
    private PostsService postsService;
    @BeforeClass
    public void beforeClass()
    {
        postsService = new PostsService();
    }
    @Test
    public void shouldCreateAPost(){
        //Arrange
        CreateAPostRequestBody requestBody =  new CreateAPostRequestBody.Builder().build();
        //Act
        CreateAPostResponse createAPostResponse = postsService.createPost(requestBody);

        //Assert
        createAPostResponse.assertPostCreate(requestBody);
    }
}

