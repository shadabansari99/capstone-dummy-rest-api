package post.deletePostById.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
public class GetAllPostsResponse {
    @Setter
    private int statusCode;

    private String total;

    private List<Data> data;

    private String limit;

    private String page;
@Getter
    public static class Data {
        private Owner owner;

        private String image;

        private String publishDate;

        private String updatedDate;

        private String id;

        private String text;

        private String likes;

        private List<String> tags;
    }
    @Getter
    public static class Owner {
        private String firstName;

        private String lastName;

        private String id;

        private String title;

        private String picture;
    }

    }
