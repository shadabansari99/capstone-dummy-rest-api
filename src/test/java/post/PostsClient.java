package post;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import post.createAPost.CreateAPostRequestBody;

import static io.restassured.RestAssured.given;

public class PostsClient {
    public static Response getPostById(String post_id) {
        Response response = given()
                .header("app-id", "633d7f032ba989d7422d72b8")
                .when()
                .pathParam("post_id",post_id)
                .get("https://dummyapi.io/data/v1/post/{post_id}");
        response.then()
                .log()
                .body();
        return response;
    }
    public static Response getAllPosts() {
        Response response = given()
                .header("app-id", "633d7f032ba989d7422d72b8")
                .when()
                .get("https://dummyapi.io/data/v1/post");
        response.then()
                .log()
                .body();
        return response;
    }

    public static Response deletePostById(String delete_postId) {

        Response response = given()
                .header("app-id", "633d7f032ba989d7422d72b8")
                .when()
                .pathParam("delete_postId",delete_postId)
                .delete("https://dummyapi.io/data/v1/post/{delete_postId}");
        response.then()
                .log()
                .body();
        return response;
    }

    public Response createPost(CreateAPostRequestBody body) {
        Response response = given()
                .header("app-id", "633d7f032ba989d7422d72b8")
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .body(body)
                .when()
                .post("https://dummyapi.io/data/v1/post/create");


        response.then().log().body();
        return response;
    }

}
