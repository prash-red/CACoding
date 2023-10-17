package use_case.clear_users;
import java.util.List;
import entity.User;
// TODO Complete me

public class ClearOutputData {
    private final List<User> users;

    public ClearOutputData(List<User> users) {
        this.users = users;
    }

    public List<User> getUsers() {
        return users;
    }
}
