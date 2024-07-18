/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nikol
 */
public class Person {
    private String name;
    private String home;
    
    public Person(String name, String home){
        this.name = name;
        this.home = home;
    }
    public String getName(){
        return this.name;
    }
    public String getHome(){
        return this.home;
    }
    
    public String toString(){
        return this.name + '\n' + "  " + this.home;
    }
    
}
