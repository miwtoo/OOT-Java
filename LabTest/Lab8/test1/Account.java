/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oot.lab8.test1;

/**
 *
 * @author All User
 */
public class Account extends Validator{
    private String user = "";
    private String pass = "";
    public Account(String user,String pass){
        this.user = user;
        this.pass = pass;
    }
    public Account(){}
    
    public void  validateAll(){
        if(checkPasswordIsLongerThanTenChars())
            System.out.println("Password length validated : true");
        else
            System.out.println("Password length validated : false");
        if(checkUsernameIsLongerThanFiveChars())
            System.out.println("Username length validated : true");
        else
            System.out.println("Username length validated : false");
        if(checkUsernameIsLowercase())
            System.out.println("Username lower case validated : true");
        else
            System.out.println("Username lower case validated : false");
        System.out.println("===========================================");
    }
   
    
    
    public  boolean checkPasswordIsLongerThanTenChars(){
        if(pass.length() > 10)
            return true;
        return false;
    }
    
    public boolean checkUsernameIsLongerThanFiveChars(){
        if(user.length() > 5)
            return true;
        return false;
    }
    
    public boolean checkUsernameIsLowercase(){
        if(isAllLowercase(user))
            return true;
        return false;
    }
    
    public boolean isAllLowercase(String a){
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i) > 'A' && a.charAt(i) < 'Z')
                return false;
        }
        return true;
    }
}
