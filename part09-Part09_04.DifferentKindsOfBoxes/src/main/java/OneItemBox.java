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

public class OneItemBox extends Box{
    private ArrayList<Item> list;
    
    public OneItemBox(){
        this.list = new ArrayList<>();
    }
    
    public boolean isInBox(Item item){
        return list.contains(item);
    }
    
    public void add(Item item){
        if(list.isEmpty()){
            list.add(item);
        }
    }
}
