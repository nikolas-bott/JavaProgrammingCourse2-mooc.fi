/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nikol
 */
public class ProductWarehouseWithHistory extends ProductWarehouse{
    private ChangeHistory change;
    //private double initialBalance;
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName,capacity);
        super.addToWarehouse(initialBalance);
        this.change = new ChangeHistory();
        change.add(initialBalance);
    }
    
    public String history(){
        return change.toString();
    }
    
    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        change.add(super.getBalance());
    }
    
    public double takeFromWarehouse(double amount){
         double result = 0;

        result = (double) super.getBalance() - amount;
        //the difference is added not just the amount
        change.add(result);
        return super.takeFromWarehouse(amount);
    }
    
    public void printAnalysis(){
        System.out.println("Product: "+super.getName());
        System.out.println("History: "+change.toString());
        System.out.println("Largest amount of product: "+ change.maxValue());
        System.out.println("Smallest amount of product: "+ change.minValue());
        System.out.println("Average: "+change.average());
    }
}
