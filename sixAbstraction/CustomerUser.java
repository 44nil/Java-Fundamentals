package sixAbstraction;

public class CustomerUser extends BaseUser {
    public CustomerUser(String email, String password) {
        super(email, password);
    }

    @Override
    public void login() {
        System.out.println("Customer " + getEmail() + " is viweing the menu...");
    }
}
