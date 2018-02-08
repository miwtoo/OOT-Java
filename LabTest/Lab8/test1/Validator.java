
package oot.lab8.test1;


public abstract class Validator implements PasswordValidator,UsernameValidation{

    
    public Validator(){}
    
    
    public abstract boolean checkPasswordIsLongerThanTenChars();
    
    public abstract boolean checkUsernameIsLongerThanFiveChars();
    
    public  abstract boolean checkUsernameIsLowercase();
    

}
