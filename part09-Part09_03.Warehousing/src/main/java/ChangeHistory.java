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

public class ChangeHistory {
    private ArrayList<Double> history;
    
    public ChangeHistory(){
        this.history = new ArrayList<>();
    }
    
    public double maxValue(){
        if(history.isEmpty()){
            return 0.0;
        }
        double max = history.get(0);
        for (int i = 1; i < history.size(); i++) {
             if(max >= history.get(i)){
                 continue;
             }
             max = history.get(i);
        }
        return max;
    }
    
    public double minValue(){
        if(history.isEmpty()){
            return 0.0;
        }
        double min = history.get(0);
        for (int i = 1; i < history.size(); i++) {
             if(min <= history.get(i)){
                 continue;
             }
             min = history.get(i);
        }
        return min;
    }
    
    public double average(){
        if(history.isEmpty()){
            return 0.0;
        }
         
        double counter = 0;
        double average = 0;
        
        for (int i = 0; i < history.size(); i++) {
            average += history.get(i);
            counter++;
        }
        return average / counter;
    }
    
    public void add(double status){
        history.add(status);
    }
    public void clear(){
        history.clear();
    }
    
    public String toString(){
        return history.toString();
    }
    
}
