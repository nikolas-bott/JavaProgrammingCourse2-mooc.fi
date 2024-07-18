/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nikol
 */
public class Student extends Person {
    private int credits;
    
    public Student(String name, String home){
        super(name,home);
        this.credits = 0;
    }
    
    public void study(){
        this.credits += 1;
    }
    
    public int credits(){
        return this.credits;
    }
    
    public String toString(){
        return super.getName()+'\n'+"  "+ super.getHome()+'\n'+"  Study credits "+this.credits;
    }
    
}
