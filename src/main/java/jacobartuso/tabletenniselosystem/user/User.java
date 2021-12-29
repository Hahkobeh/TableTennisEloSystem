package jacobartuso.tabletenniselosystem.user;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("users")
public class User {
    @Id
    private String id;
    private String name;
    private String email;
    private int password;
    private int rating;
    private boolean verified;
    private int unactualizedRating;


    public User(String id, String name, String email, int password, int rating, boolean verified, int unactualizedRating) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.rating = rating;
        this.verified = verified;
        this.unactualizedRating = unactualizedRating;
    }

    public User(String name, String email, int password, int rating, boolean verified, int unactualizedRating) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.rating = rating;
        this.verified = verified;
        this.unactualizedRating = unactualizedRating;
    }

    public int getUnactualizedRating() {
        return unactualizedRating;
    }

    public void setUnactualizedRating(int unactualizedRating) {
        this.unactualizedRating = unactualizedRating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }
}
