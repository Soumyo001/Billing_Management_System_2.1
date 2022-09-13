package billing_management_system;
public class passwordException extends RuntimeException{
    public passwordException(){
        super("Password must contain at least one upper case and one lower case and one digit");
    }
}
