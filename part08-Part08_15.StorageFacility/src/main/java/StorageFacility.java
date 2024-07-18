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
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> map;
    
    public StorageFacility(){
        this.map = new HashMap<>();
    }
    
    public void add(String unit, String item){
        if(map.containsKey(unit)){
            map.get(unit).add(item);
            return;
            //System.out.println(map.get(unit));
        }
        map.put(unit, new ArrayList<>());
        map.get(unit).add(item);
        
    }
    
    public ArrayList<String> contents(String storageUnit){
        if(map.containsKey(storageUnit)){
            return map.get(storageUnit);
        }
        System.out.println("komisch");
        ArrayList<String> empty = new ArrayList<>();
        return empty;
    }
    
    public void remove(String storageUnit, String item){
        int a = map.get(storageUnit).indexOf(item);
        map.get(storageUnit).remove(a);
        
        if(map.get(storageUnit).isEmpty()){
            map.remove(storageUnit);
        }
    }
    
    public ArrayList<String> storageUnits(){
        ArrayList<String> list = new ArrayList<>();
        
        if(!(map.keySet().isEmpty())){
            for (String string : map.keySet()) {
                list.add(string);
            }
        }

        return list;
    }
    
}
