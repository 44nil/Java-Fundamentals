package sixAbstraction;

/**
 * AdminUser class inherits from BaseUser (Inheritance).
 * It reuses common user fields like email and password.
 */

public class AdminUser extends BaseUser implements Deletable {
    // An additional field specific only to Admin
    private int authLevel;

    /**
     * Constructor for AdminUser.
     * It must call the parent constructor using super().
     */
    public AdminUser(String email,  String password, int authLevel) {
        //We send the email and password to the "Father" (BaseUser) constructor
        super(email, password);
        this.authLevel = authLevel;
    }

    @Override 
    public void login() {
        System.out.println("Admin " + getEmail() + " has logged in with authority level " + authLevel);
    }

    /**
     * A behavior unique to AdminUser
     */
    @Override
    public void deleteUser(String userId) {
        System.out.println("Admin (Level " + authLevel + ") is deleting user: " + userId);
    }

    //Getter for Admin-specific field
    public int getAuthLevel() {
        return authLevel;
    }


}