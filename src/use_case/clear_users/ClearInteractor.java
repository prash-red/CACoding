package use_case.clear_users;
import java.util.List;
import entity.User;
// TODO Complete me

public class ClearInteractor implements ClearInputBoundary {
    private final ClearUserDataAccessInterface clearUserDataAccessInterface;
    private final ClearOutputBoundary clearOutputBoundary;
    public ClearInteractor(ClearUserDataAccessInterface clearUserDataAccessInterface, ClearOutputBoundary clearOutputBoundary) {
        this.clearUserDataAccessInterface = clearUserDataAccessInterface;
        this.clearOutputBoundary = clearOutputBoundary;
    }
    @Override
    public void execute() {
        List<User> users = clearUserDataAccessInterface.clearUsers();
        ClearOutputData clearOutputData = new ClearOutputData(users);
        clearOutputBoundary.present(clearOutputData);

    }
}
