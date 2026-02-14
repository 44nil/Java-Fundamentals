package sixAbstraction;

//Superclass
// The word 'abstract' means that objects of this class cannot be created!
public abstract class BaseUser {
    private String email;  //We encapsulated the data (Encapsulation).
    private String password;

    public BaseUser(String email, String password) {  //Constructor
        this.email = email;
        this.password = password;
    }


    // Abstract method: It has no body!
    // We say, "Everyone should log in, but they should decide how to do it themselves."
    public abstract void login();
    //Getters
    public String getEmail() { return email; }

}
