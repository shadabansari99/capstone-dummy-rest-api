package user.createUser.response;

import lombok.Getter;
import lombok.Setter;
import user.createUser.CreateUserRequestBody;

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
        assertEquals(this.getFirstName(),requestBody.getFirstName());
        assertEquals(this.getLastName(),requestBody.getLastName());
    }

}
