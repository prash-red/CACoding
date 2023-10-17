package interface_adapter.clear_users;
import java.util.*;
import entity.User;
// TODO Complete me

public class ClearState {
    private List<String> users = new ArrayList<>();

    public ClearState(ClearState copy) {
        this.users = copy.users;
    }

    public ClearState() {
    }
    public List<String> getUsers() {
        return users;
    }

    public void setUsers(List<String> users) {
        this.users = users;
    }

}
