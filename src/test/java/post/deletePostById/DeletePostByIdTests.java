package post.deletePostById;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import post.PostsService;
import post.deletePostById.response.DeletePostByIdResponse;
import post.deletePostById.response.GetAllPostsResponse;

public class DeletePostByIdTests {
    private PostsService postsService;
    @BeforeClass
    public void beforeClass()
    {
        postsService = new PostsService();
    }

    @Test
    public void shouldDeletePostById(){

        GetAllPostsResponse getAllPostsResponse = postsService.getAllPosts();
        //Arrange
        String deletePostId= getAllPostsResponse.getData().get(0).getId();
        //Act
        DeletePostByIdResponse deletePostByIdResponse = postsService.deletePostById(deletePostId);
        //Assert
        Assert.assertEquals(getAllPostsResponse.getStatusCode(),200);

    }


}
