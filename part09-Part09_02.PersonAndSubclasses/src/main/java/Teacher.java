/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nikol
 */
public class Teacher extends Person{
    private int salary;
    
    public Teacher(String name, String home, int salary){
        super(name,home);
        this.salary = salary;
    }
    
    public String toString(){
        return super.getName() + '\n' + "  " + super.getHome() + '\n' + "  salary " + this.salary+ " euro/month";
    }
}
