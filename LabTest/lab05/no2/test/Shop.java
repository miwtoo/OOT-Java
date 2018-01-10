package oot.lab5.no2.test;

public class Shop {
    public static void main(String[] args){
        Customer c1 = new Customer("C01", "Somchai", "Male");
        Customer c2 = new Customer("C02", "Jaidee", "Female");
        Customer c3 = new Customer("C03", "Ranee", "Female");
        
        Item i1 = new Item("i01", "Soap", 10, 5);
        Item i2 = new Item("i02", "Shampoo", 5, 20);
        Item i3 = new Item("i03", "Book", 15, 30);
        Item i4 = new Item("i04", "Pen", 2, 15);
        Item i5 = new Item("i05", "Glass", 5, 10);
        
        ShoppingCart cart1 = new ShoppingCart(c1);
        ShoppingCart cart2 = new ShoppingCart(c2);
        ShoppingCart cart3 = new ShoppingCart(c3);
        
        cart1.addItemToCart(i1);
        cart2.addItemToCart(i3);
        cart3.addItemToCart(i5);
        
        
        cart1.getTotalPrice();
        
       
        
        cart2.addItemToCart(i2);
        cart2.addItemToCart(i4);
        
        cart2.getTotalPrice();
        
        
        cart3.addItemToCart(i1);
        cart3.addItemToCart(i4);
        cart3.addItemToCart(i5);
        
        cart3.getTotalPrice();
        
    }
}
