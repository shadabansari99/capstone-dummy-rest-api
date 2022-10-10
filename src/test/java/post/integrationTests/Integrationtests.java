package post.integrationTests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import post.PostsService;
import post.createAPost.CreateAPostRequestBody;
import post.createAPost.response.CreateAPostResponse;
import user.UsersService;

public class Integrationtests {
    private PostsService postsService;
    @BeforeClass
    public void beforeClass()
    {
        postsService = new PostsService();
    }
    @Test
    public void shouldCreateAndDeletePost() {
        CreateAPostRequestBody requestBody = new CreateAPostRequestBody.Builder().build();
        CreateAPostResponse createAPostResponse = postsService.createPost(requestBody);

        int statusCodeofCreatePost = createAPostResponse.getStatusCode();
        Assert.assertEquals(statusCodeofCreatePost,200);

        String id = createAPostResponse.getId();

        int statusCodeOfDeletePost = postsService.deletePost(id);
        //Assert
        Assert.assertEquals(statusCodeOfDeletePost, 200);
    }
    }

