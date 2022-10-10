package post;

import io.restassured.response.Response;
import post.createAPost.CreateAPostRequestBody;
import post.createAPost.response.CreateAPostResponse;
import post.deletePostById.response.DeletePostByIdResponse;
import post.deletePostById.response.GetAllPostsResponse;
import post.getPostByPostId.response.GetPostByIdResponse;

public class PostsService {
    public GetPostByIdResponse getPostById(String post_id) {
        Response response = new PostsClient().getPostById( post_id);
        int statusCode = response.statusCode();
        GetPostByIdResponse getPostByIdResponse = response.as(GetPostByIdResponse.class);
        getPostByIdResponse.setStatusCode(statusCode);
        return getPostByIdResponse;
    }
    public GetAllPostsResponse getAllPosts()
    {
        Response response = new PostsClient().getAllPosts();
        int statusCode = response.statusCode();
        GetAllPostsResponse getAllPostsResponse = response.as(GetAllPostsResponse.class);
        getAllPostsResponse.setStatusCode(statusCode);
        return getAllPostsResponse;
    }
    public DeletePostByIdResponse deletePostById(String delete_postId)
    {
        Response response = new PostsClient().deletePostById(delete_postId);
        int statusCode =   response.statusCode();
        DeletePostByIdResponse deletePostByIdResponse = response.as(DeletePostByIdResponse.class);
        deletePostByIdResponse.setStatusCode(statusCode);
        return deletePostByIdResponse;

    }
    public int deletePost(String id) {
        Response response = new PostsClient().deletePostById(id);
        return response.statusCode();
    }
    public CreateAPostResponse createPost(CreateAPostRequestBody body)
    {
        Response response = new PostsClient().createPost(body);
        CreateAPostResponse createAPostResponse = response.as(CreateAPostResponse.class);
        createAPostResponse.setStatusCode(response.statusCode());
        return createAPostResponse;
    }
}
