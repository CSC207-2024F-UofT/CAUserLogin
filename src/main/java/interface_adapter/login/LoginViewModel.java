package interface_adapter.login;

import interface_adapter.ViewModel;

/**
 * The View Model for the Login View.
 */
public class LoginViewModel extends ViewModel<LoginState> {

    public LoginViewModel() {
        // When used as super(arguments); in a constructor, it calls a constructor from the superclass
        super("log in");
        setState(new LoginState());
    }

}
