/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oot.lab5.no2.test;

public class Customer {
    private String cus_id = "";
    private String cus_name = "";
    private String cus_gender = "";
    
    public Customer(String cus_id, String cus_name, String cus_gender){
        this.cus_gender = cus_gender;
        this.cus_id = cus_id;
        this.cus_name = cus_name;
    }
    
    public String getCus_id(){
        return cus_id;
    }
    
    public void setCus_id(String cus_id){
        this.cus_id = cus_id;
    }
    
    public String getCus_name(){
        return cus_name;
    }
    
    public void setCus_name(String cus_name){
        this.cus_name = cus_name;
    }
    
    public String getCus_gnder(){
        return cus_gender;
    }
    
    public void setCus_gender(String cus_id){
        this.cus_gender = cus_gender;
    }
}
