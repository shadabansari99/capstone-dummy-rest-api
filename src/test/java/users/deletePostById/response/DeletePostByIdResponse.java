package users.deletePostById.response;

import lombok.Getter;
import lombok.Setter;

@Getter
public class DeletePostByIdResponse {

    @Setter
    private int statusCode;
    private String id;

}

