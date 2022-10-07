package users.integrationTests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import users.UsersService;
import users.createAPost.CreateAPostRequestBody;
import users.createAPost.response.CreateAPostResponse;

public class Integrationtests {
    private UsersService usersService;

    @BeforeClass
    public void beforeClass()
    {
        usersService = new UsersService();
    }

    @Test
    public void shouldCreateAndDeletePost() {
        CreateAPostRequestBody requestBody = new CreateAPostRequestBody.Builder().build();
        CreateAPostResponse createAPostResponse = usersService.createPost(requestBody);

        int statusCodeofCreatePost = createAPostResponse.getStatusCode();
        Assert.assertEquals(statusCodeofCreatePost,200);

        String id = createAPostResponse.getId();

        int statusCodeOfDeletePost = usersService.deletePost(id);
        //Assert
        Assert.assertEquals(statusCodeOfDeletePost, 200);
    }
    }

