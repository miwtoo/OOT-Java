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
public class ShoppingCart {
    private int count = 0;
    private Customer c = null;
    private Item[] i = new Item[10];
    
    public ShoppingCart(Customer c){
        this.c = c;
    }
    
    public void addItemToCart(Item i){
        if (i.getStock() > 0){
            this.i[count] = i;
            count++;
        }
        else
            System.out.println("Sory " + i.getItem_name() + " is out of stock");
        
    }
    
    public double getPrice(){
        double price = 0.0;
        
        for(int j = 0 ; j < count ; j++){
            price += this.i[j].getPrice();
        }
        
        return price;
    }
    
    public void getTotalPrice(){
        double dis = 15.0;
        System.out.println("You have totally " + getCount() + " item.");
        if(c.getCus_gnder() == "Female"){
            System.out.println("Promation !!! Discount for female customer 15 % \nActal price " + getPrice() + " bath pay only "+(getPrice()*(100 - dis)/100)+ " bath\n");
        }
        else{
            System.out.println( getCus().getCus_name() + " have to pay " + getPrice() + " bath\n");
        }
    }
    
    public Customer getCus(){
        return c;
    }
    
    public void setCus(Customer c){
        this.c = c;
    }
    
    public Item getItem(int n){
        return i[n];
    }
    
    public void setItem(Item i[], int n){
        this.i[n] = i[n];
    }
    
    public int getCount(){
        return count;
    }
}
