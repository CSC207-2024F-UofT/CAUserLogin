package use_case.login;

import entity.User;

/**
 * DAO for the Login Use Case.
 */
public interface LoginUserDataAccessInterface {

    /**
     * Checks if the given username exists.
     * @param username the username to look for
     * @return true if a user with the given username exists; false otherwise
     */
    boolean existsByName(String username);

    /**
     * Saves the user.
     * @param user the user to save
     */
    void save(User user);

    /**
     * Returns the user with the given username.
     * @param username the username to look up
     * @return the user with the given username
     */
    User get(String username);

    /**
     * Set name of current user in application.
     * @param name the user we need to set up
     */
    void setCurrentUser(String name);

    /**
     * Get name of current user in application.
     * @return name the user as a String. Use "" to show that user is not set
     */
    String getCurrentUser();
}
