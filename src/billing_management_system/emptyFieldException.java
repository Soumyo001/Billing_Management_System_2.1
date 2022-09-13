package billing_management_system;
public class emptyFieldException extends RuntimeException {
    public emptyFieldException(){
        super("One or more field is empty!");
    }
}
