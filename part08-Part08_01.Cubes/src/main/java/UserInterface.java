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
    
    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }
    
    public void start(){
        
        while(true){
            String input = scanner.nextLine();
            if(input.equals("end")){
                break;
            }
            int number = Integer.parseInt(input);
            System.out.println(number*number*number);
        }
    }
}
