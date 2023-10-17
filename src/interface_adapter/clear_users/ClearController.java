package interface_adapter.clear_users;

// TODO Complete me
import use_case.clear_users.ClearInputBoundary;

public class ClearController {
    final ClearInputBoundary clearInputBoundary;
    public ClearController(ClearInputBoundary clearInputBoundary) {
        this.clearInputBoundary = clearInputBoundary;
    }
    public void execute() {
        clearInputBoundary.execute();
    }
}
