package fivePolymorphism;

/**
 * AdminUser class inherits from BaseUser (Inheritance).
 * It reuses common user fields like email and password.
 */

public class AdminUser extends BaseUser {
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

    /**
     * A behavior unique to AdminUser
     */
    public void deleteUser() {
        System.out.println("User deleted by admin with level: " + authLevel);
    }

    //Getter for Admin-specific field
    public int getAuthLevel() {
        return authLevel;
    }

    // TEST 
    public static void main(String[] args) {
        AdminUser admin = new AdminUser("esranil@gmail.com", "secret123", 5);
        admin.login(); // Inherited from BaseUser
        admin.deleteUser(); // Exclusive to admin
    }
}