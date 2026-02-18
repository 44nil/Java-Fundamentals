package sixAbstraction;

import java.util.ArrayList;

public class AbstractionTest {
    public static void main(String[] args) {

        //1. Creating Objects
        //Since BaseUser is a "template", we cannot create objects from it (Abstraction).
        AdminUser admin = new AdminUser("esra@gmail.com", "admin123", 5);
        CustomerUser customer = new CustomerUser("nil@gmail.com", "customer123");


        //2. Polymorphism
        //We collect different types of users in a single list.
        ArrayList<BaseUser> users = new ArrayList<>();
        users.add(admin);
        users.add(customer);

        System.out.println("---User Login Control ---");
        for (BaseUser u : users) {
            //Here Java understands who the object really is (Dynamic Dispatch).
            u.login();
        }

        System.out.println("\n---Authorization and Deletion Test ---");
        //We test Admin's deletion ability (Interface).
        admin.deleteUser("user_101");

    }
}
