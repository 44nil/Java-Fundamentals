package fivePolymorphism;

//Superclass
public class BaseUser {
    private String email;  //We encapsulated the data (Encapsulation).
    private String password;

    public BaseUser(String email, String password) {  //Constructor
        this.email = email;
        this.password = password;
    }

    public void login() {
        System.out.println(email + " has logged in with password: " + password);
    }

    //Getters
    public String getEmail() { return email; }

}
