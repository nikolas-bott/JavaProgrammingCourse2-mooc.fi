/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nikol
 */
import java.util.Scanner;
import java.util.ArrayList;

public class UserInterface {
    private Scanner scanner;    
    private ArrayList<Integer> list;
    
    public UserInterface(Scanner scanner, ArrayList list){
        this.scanner = scanner;
        this.list = list;
    }
    
    public void start(){
        while(true){
            int number = Integer.parseInt(scanner.nextLine());
            
            if(number == 0){
                if(average() < 0){
                    System.out.println("Cannot calculate the average");
                    break;
                }
                System.out.println(average());
                break;
            }
            
            list.add(number);
        }
    }
    
    public double average(){
        double average = 0;
        double counter = 0;
        
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) > 0){
                average += list.get(i);
                counter++;
            } 
        }
        if(average <= 0){
            return -1;
        }
        return average/counter;
    }
}
