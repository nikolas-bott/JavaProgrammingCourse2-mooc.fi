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
        
public class UserInterface {

    private Scanner scanner;
    
    Container con1 = new Container();
    Container con2 = new Container();
    
    public UserInterface(Scanner scanner){
        this.scanner = scanner;
    }
    
    public void start(){
       
        while(true){
            System.out.println("First: "+con1.contains()+"/100");
            System.out.println("Second: "+con2.contains()+"/100");
            
            String firstInput = scanner.nextLine();
            String[] inputs = firstInput.split(" ");
            String input = inputs[0];
            if(input.equals("quit")){
                break;
            }
            int number = Integer.parseInt(inputs[1]);

            if(input.equals("add")){
                con1.add(number);
            }
            if(input.equals("move") && !(input.equals("remove"))){
                if(con1.contains() < number){
                    con2.add(con1.contains());
                    con1.remove(number);
                    continue;
                }
                con1.remove(number);
                con2.add(number);
            }
            if(input.equals("remove") & !(input.equals("move"))){
                con2.remove(number);
            }
        }
    }
    
}


