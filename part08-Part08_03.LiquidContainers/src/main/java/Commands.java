/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nikol
 */
public class Commands {
    private Container con1;
    private Container con2;
    
    public Commands(Container con1, Container con2){
        this.con1 = con1;
        this.con2 = con2;
    }
    
    
    public void add(int amount){
        if(amount < 0){
            return;
        }
        if(con1.getAmount() + amount >= 100){
            con1.setAmount(100);
        }else{
            con1.setAmount(con1.getAmount() + amount);
        }
    }
    
    public void remove(int amount){
        if(amount < 0){
            return;
        }
        //int amount1 = con1.getAmount();
        int amount2 = con2.getAmount();
        
        if(amount2 - amount < 0){
            con2.setAmount(0);
        }else{
            con2.setAmount(amount2-amount);
        }
    }
    
    public void move(int amount){
        int amount1 = con1.getAmount();
        int amount2 = con2.getAmount();
        
        if(amount < 0){
            return;
        }
        
        if(amount > 100){
            con1.setAmount(0);
            con2.setAmount(100);
            return;
        }
        if(amount > amount1){
            con2.setAmount(amount1);
            con1.setAmount(0);  
            return;
        }
        //---
         if(amount + con2.getAmount() > 100){
            con1.setAmount(con1.getAmount()-amount);
            con2.setAmount(100);  
            return;
        }
        if(amount2 + amount > 100){
            con2.setAmount(100);
            con1.setAmount(amount1-amount);
            return;
        }
        
        con2.setAmount(amount2 + amount);
        con1.setAmount(amount1-amount);
        
    }
}

