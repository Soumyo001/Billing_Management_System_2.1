package billing_management_system;
public class password_limitations {
    public static boolean isUpper(String s,int i){
        if(i==s.length()) return false;
        if(Character.isUpperCase(s.charAt(i))) return true;
        else return isUpper(s,i+1);
    }
    public static boolean isLower(String s,int i){
        if(i==s.length()) return false;
        if(Character.isLowerCase(s.charAt(i))) return true;
        else return isLower(s,i+1);
    }
    public static boolean isDigit(String s,int i){
        if(i==s.length()) return false;
        if(!(Character.isAlphabetic(s.charAt(i)))) return true;
        else return isDigit(s,i+1);
    }
}
