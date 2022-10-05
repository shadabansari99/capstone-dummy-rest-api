package users.getAllUsersAccount;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import users.getAll.GetAllUsersResponse;

import java.util.List;

@Getter
public class GetAllUsersAccountResponse {
    @Setter
    private int statusCode;
    @JsonProperty("data")
    private List<Data> dataList;
    private int total;
    private String limit;
    private String page;

    @Getter
    public static class Data {
        private String firstName;
        private String lastName;
        private String id;
    }

}
