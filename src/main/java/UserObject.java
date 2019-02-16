import java.io.Serializable;

public class UserObject implements Serializable {
    private String name;

    public UserObject(String name) {
        this.name = name;
    }
}
