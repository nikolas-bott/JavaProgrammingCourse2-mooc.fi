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

public class Box implements Packable{
    private ArrayList<Packable> list;
    private double max;
    
    public Box(double max){
        this.max = max;
        this.list = new ArrayList<>();
    }
    
    public double weight(){
        double weight = 0;
        for (int i = 0; i < list.size(); i++) {
            weight += list.get(i).weight();
        }
        return weight;
    }
    
    public void add(Packable object){
        if(object.weight()+weight()>max){
            return;
        }
        list.add(object);
    }
    
    public String toString(){
        //int temp = list.size()+1;
        return "Box: "+list.size()+" items, total weight "+ weight() + " kg";
    }
    
}
