package post.integrationTests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import post.PostsService;
import post.createAPost.CreateAPostRequestBody;
import post.createAPost.response.CreateAPostResponse;


public class IntegrationTests {
    private PostsService postsService;
    @BeforeClass
    public void beforeClass()
    {
        postsService = new PostsService();
    }
    @Test
    public void shouldCreateAndDeletePost() {
        //Arrange
        CreateAPostRequestBody requestBody = new CreateAPostRequestBody.Builder().build();
        //Act
        CreateAPostResponse createAPostResponse = postsService.createPost(requestBody);
        int statusCodeOfCreatePost = createAPostResponse.getStatusCode();
        //Assert
        Assert.assertEquals(statusCodeOfCreatePost,200);
        //Arrange
        String id = createAPostResponse.getId();
        //Act
        int statusCodeOfDeletePost = postsService.deletePost(id);
        //Assert
        Assert.assertEquals(statusCodeOfDeletePost, 200);
    }
    }

