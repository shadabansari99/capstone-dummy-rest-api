package user.createUser.response;

import lombok.Getter;
import lombok.Setter;
import org.testng.AssertJUnit;
import user.createUser.CreateUserRequestBody;

import static org.testng.Assert.assertEquals;

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
    public void assertUserNegative(CreateUserRequestBody requestBody) {
        AssertJUnit.assertEquals(this.getStatuscode(),400);
        AssertJUnit.assertEquals(this.getError(),"BODY_NOT_VALID");
        AssertJUnit.assertEquals(this.getData().getEmail(),"Email already used");

    }


}
