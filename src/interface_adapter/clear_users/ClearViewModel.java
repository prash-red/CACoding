package interface_adapter.clear_users;
import interface_adapter.ViewModel;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

// TODO Complete me

public class ClearViewModel extends ViewModel {
    public static final String OK_BUTTON_LABEL = "OK";
    private final PropertyChangeSupport support = new PropertyChangeSupport(this);
    private ClearState state = new ClearState();
    public ClearViewModel() {
        super("clear");
    }

    public void setState(ClearState state) {
        this.state = state;
    }

    public ClearState getState() {
        return state;
    }

    public void firePropertyChanged() {
        support.firePropertyChange("state", null, this.state);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }
}
