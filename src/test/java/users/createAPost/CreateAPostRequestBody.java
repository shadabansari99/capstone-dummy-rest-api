package users.createAPost;

import lombok.Getter;

import java.util.List;
@Getter
public class CreateAPostRequestBody {
    private String owner;

    private String image;

    private String text;

    private List<String> tags;

    public CreateAPostRequestBody(Builder builder) {
        this.image=builder.image;
        this.owner=builder.owner;
        this.tags=builder.tags;
        this.text= builder.text;
    }

    public static class Builder{
        private String owner;

        private String image;

        private String text;

        private List<String> tags;
        public Builder()
        {
            this.image="https://i.picsum.photos/id/866/200/300.jpg?hmac=rcadCENKh4rD6MAp6V_ma-AyWv641M4iiOpe1RyFHeI";
            this.tags=List.of("Mountain","Clouds","Sky");
            this.owner="633eb2b249c8a1229be5cda8";
            this.text="A image of a mountain";
        }
        public CreateAPostRequestBody build(){
            CreateAPostRequestBody createAPostRequestBody = new CreateAPostRequestBody(this);
            return  createAPostRequestBody;
        }
    }
}
