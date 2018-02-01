/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oot.lab5.no2.test;

/**
 *
 * @author All User
 */
public class Item {
    private String item_id = "";
    private String item_name = "";
    private int stock = 0;
    private double price = 0.0;
    
    public Item(String item_id, String item_name, int stock, double price){
        this.item_id = item_id;
        this.item_name = item_name;
        this.stock = stock;
        this.price = price;
    }
    
    public String getItem_id(){
        return item_id;
    }
    
    public void setItem_id(String item_id){
        this.item_id = item_id;
    }
    
    public String getItem_name(){
        return item_name;
    }
    
    public void setItem_name(String item_name){
        this.item_name = item_name;
    }
    
    public int getStock(){
        return stock;
    }
    
    public void setStock(int stock){
        this.stock = stock;
    }
    
    public double getPrice(){
        return price;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
}
