import java.util.ArrayList;

public class User {
    String userName,password,email,first_name,last_name,user_type;
    int user_id;
    public User(String userName, String password, String email, String first_name, String last_name, String user_type,
            int user_id) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.first_name = first_name;
        this.last_name = last_name;
        this.user_type = user_type;
        this.user_id = user_id;
    }
    @Override
    public String toString() {
        return "User [userName=" + userName + ", password=" + password + ", email=" + email + ", first_name="
                + first_name + ", last_name=" + last_name + ", user_type=" + user_type + ", user_id=" + user_id + "]";
    }


}
