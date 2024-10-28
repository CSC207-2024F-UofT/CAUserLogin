package interface_adapter.logged_in;

import interface_adapter.ViewModel;

/**
 * The View Model for the Logged In View.
 */
public class LoggedInViewModel extends ViewModel<LoggedInState> {
    private boolean passwordChanged;
    private String errorMessage;

    public LoggedInViewModel() {
        super("logged in");
        setState(new LoggedInState());
    }

    public void setPasswordChanged(boolean changed) {
        this.passwordChanged = changed;
    }

    public boolean isPasswordChanged() {
        return this.passwordChanged;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }
}
