/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nikol
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ShoppingCart {
    private List<Item> list; 
    
    public ShoppingCart(){
        this.list = new ArrayList<>();
    }
    
    public void add(String product, int price){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getName().equals(product)){
            //System.out.println("Ja");
            list.get(i).increaseQuantity();
            return;   
            }  
        }
        list.add(new Item(product, 1, price));
    }
    
    public int price(){
        int totalPrice = 0;
        for (int i = 0; i < list.size(); i++) {
            totalPrice += list.get(i).price();
        }
        return totalPrice;
    }
    
    public void print(){
        for (int i = list.size(); i > 0;i--) {
            System.out.println(list.get(i-1));
        }
    }
}
