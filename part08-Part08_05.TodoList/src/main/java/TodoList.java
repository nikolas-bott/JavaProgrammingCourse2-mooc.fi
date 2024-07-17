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

public class TodoList {
    private ArrayList<String> list;
    
    public TodoList(){
        this.list = new ArrayList<String>();
    }
    
    public void add(String task){
        this.list.add(task);
    }
    
    public void print(){
        for (int i = 0; i < list.size(); i++) {
            int temp = i+1;
            System.out.println(temp+": "+list.get(i));
        }
    }
    
    public void remove(int number){
        int temp = number-1;
        list.remove(temp);
    }
    
}
