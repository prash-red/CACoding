package interface_adapter.clear_users;
import java.util.ArrayList;
import java.util.List;
import entity.User;
import interface_adapter.ViewManagerModel;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;
// TODO Complete me

public class ClearPresenter implements ClearOutputBoundary {
    private ViewManagerModel viewManagerModel;
    private final ClearViewModel clearViewModel;
    public ClearPresenter(ViewManagerModel viewManagerModel, ClearViewModel clearViewModel) {
        this.viewManagerModel = viewManagerModel;
        this.clearViewModel = clearViewModel;
    }

    @Override
    public void present(ClearOutputData clearOutputData) {
        // TODO Complete me
        List<User> users = clearOutputData.getUsers();
        ClearState clearState = clearViewModel.getState();
        List<String> usernames = new ArrayList<>();
        for (User user : users) {
            usernames.add(user.getName());
        }
        clearState.setUsers(usernames);
        clearViewModel.setState(clearState);
        clearViewModel.firePropertyChanged();
        viewManagerModel.setActiveView(clearViewModel.getViewName());
        viewManagerModel.firePropertyChanged();

    }
}
