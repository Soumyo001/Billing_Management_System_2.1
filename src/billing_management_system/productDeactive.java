package billing_management_system;
public class productDeactive extends RuntimeException{
    public productDeactive(){
        super("Product not active");
    }
}
