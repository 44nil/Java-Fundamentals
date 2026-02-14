package fivePolymorphism;

import java.util.ArrayList;
import java.util.List;

public class PolymorphismTest {
    public static void main(String [] args) {
        // We collect DIFFERENT objects in the SAME list!
        List<BaseUser> users = new ArrayList<>();

        users.add(new AdminUser("nil@admin.com", "123" ,5));
        users.add(new CustomerUser("eray@customer.com", "abc"));
        
        //We give the same order to all of them in a single loop: login()
        for (BaseUser user: users) {
            user.login();
            // Java does its magic here:
            // If the user is in Admin, Admin's login is
            // If it is a Customer, the Customer's login works!
        }
    }
}
