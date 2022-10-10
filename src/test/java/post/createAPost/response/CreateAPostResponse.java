package post.createAPost.response;

import lombok.Getter;
import lombok.Setter;
import post.createAPost.CreateAPostRequestBody;

import java.util.List;

import static org.testng.Assert.assertEquals;

@Getter
public class CreateAPostResponse {
    @Setter
    private int statusCode;
    private Owner owner;

    private String image;

    private String link;

    private String publishDate;

    private String id;

    private String text;

    private String updatedDate;

    private String likes;

    private List<String> tags;

    @Getter
    public class Owner {
        private String firstName;

        private String lastName;

        private String id;
    }

    public void assertPostCreate(CreateAPostRequestBody createAPostRequestBody)
    {
        assertEquals(this.getStatusCode(),200);
    }



}
