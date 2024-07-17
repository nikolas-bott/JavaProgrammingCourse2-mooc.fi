/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nikol
 */
public class Container {
    private int contains;
    
    public Container(){
       this.contains = 0;
    }
    
    public void add(int amount){
        if(amount < 0){
            return;
        }
        if(this.contains + amount >= 100){
            this.contains = 100;
        }else{
            this.contains = this.contains + amount;
        }
    }
    
    public void remove(int amount){
        if(amount < 0){
            return;
        }
        //int amount1 = con1.getAmount();       
        if(this.contains - amount < 0){
            this.contains = 0;
        }else{
            this.contains -= amount;
        }
    
    }
    
    public int contains(){
        return this.contains;
    }
    
    public String toString(){
        return this.contains+"/100";
    }
    
}
