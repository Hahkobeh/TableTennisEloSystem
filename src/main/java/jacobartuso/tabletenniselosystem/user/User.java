package jacobartuso.tabletenniselosystem.user;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("users")
public class User {
    @Id
    private String id;
    private String name;
    private String email;
    private int password;
    private int rating;
    private boolean verified;

    public User(String id, String name, String email, int password, int rating, boolean verified) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.rating = rating;
        this.verified = verified;
    }

    public User(String name, String email, int password, int rating, boolean verified) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.rating = rating;
        this.verified = verified;
    }

}
