package user.createUser.response;

import lombok.Getter;
import lombok.Setter;

@Getter
public class CreateUserErrorResponse {
    @Setter
    private int statuscode;
    private Data data;
    private String error;

    @Getter
    public static class Data{
        private String email;
        private String message;

    }


}
