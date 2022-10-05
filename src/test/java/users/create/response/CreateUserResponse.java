package users.create.response;

import lombok.Getter;
import lombok.Setter;
import org.testng.Assert;
import users.create.CreateUserRequestBody;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
@Getter
public class CreateUserResponse {

    @Setter
    private int statusCode;
    private String firstName;

    private String lastName;

    private String id;

    private String updatedDate;

    private String email;

    private String registerDate;

    public void assertUser(CreateUserRequestBody requestBody) {
        assertEquals(this.getStatusCode(),200);
        assertEquals(this.getEmail(),requestBody.getEmail());

    }

}
