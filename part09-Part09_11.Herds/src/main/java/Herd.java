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

public class Herd implements Movable{
    private ArrayList<Movable> list;
    
    public Herd(){
        this.list = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable){
        this.list.add(movable);
    }
    
    public void move(int dx, int dy){
        for (int i = 0; i < list.size(); i++) {
            this.list.get(i).move(dx, dy);
        }
    }
    
    public String toString(){
        if(list.isEmpty()){
            return "";
        }
        
        String returnString = list.get(0).toString();
        if(list.size() > 0){
          for (int i = 1; i < list.size(); i++) {
            returnString += "\n"+list.get(i).toString();
            }  
        } 
        return returnString;
    }
}
